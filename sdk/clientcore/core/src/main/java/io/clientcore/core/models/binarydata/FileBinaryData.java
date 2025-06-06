// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.models.binarydata;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.implementation.utils.SliceInputStream;
import io.clientcore.core.models.CoreException;
import io.clientcore.core.serialization.json.JsonWriter;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.serialization.ObjectSerializer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * A {@link BinaryData} implementation backed by a file.
 */
@Metadata(properties = MetadataProperties.IMMUTABLE)
public class FileBinaryData extends BinaryData {
    private static final ClientLogger LOGGER = new ClientLogger(FileBinaryData.class);
    private final Path file;
    private final int chunkSize;
    private final long position;
    private final long length;

    private volatile byte[] bytes;
    private static final AtomicReferenceFieldUpdater<FileBinaryData, byte[]> BYTES_UPDATER
        = AtomicReferenceFieldUpdater.newUpdater(FileBinaryData.class, byte[].class, "bytes");

    /**
     * Creates a new instance of {@link FileBinaryData}.
     *
     * @param file The {@link Path} content.
     * @param chunkSize The requested size for each read of the path.
     * @param position Position, or offset, within the path where reading begins.
     * @param length Total number of bytes to be read from the path.
     * @throws NullPointerException if {@code file} is null.
     * @throws IllegalArgumentException if {@code chunkSize} is less than or equal to zero.
     * @throws IllegalArgumentException if {@code position} is less than zero.
     * @throws IllegalArgumentException if {@code length} is less than zero.
     * @throws CoreException if file doesn't exist.
     */
    public FileBinaryData(Path file, int chunkSize, Long position, Long length) {
        this(validateFile(file), validateChunkSize(chunkSize), validatePosition(position),
            validateLength(length, file.toFile().length(), validatePosition(position)));
    }

    FileBinaryData(Path file, int chunkSize, long position, long length) {
        this.file = file;
        this.chunkSize = chunkSize;
        this.position = position;
        this.length = length;
    }

    private static Path validateFile(Path file) {
        Objects.requireNonNull(file, "'file' cannot be null.");

        if (!file.toFile().exists()) {
            throw LOGGER.throwableAtError()
                .addKeyValue("file", file.toString())
                .log("File does not exist.", CoreException::from);
        }

        return file;
    }

    private static int validateChunkSize(int chunkSize) {
        if (chunkSize <= 0) {
            throw LOGGER.throwableAtError()
                .log("'chunkSize' cannot be less than or equal to 0.", IllegalArgumentException::new);
        }

        return chunkSize;
    }

    private static long validatePosition(Long position) {
        if (position != null && position < 0) {
            throw LOGGER.throwableAtError().log("'position' cannot be negative.", IllegalArgumentException::new);
        }

        return (position != null) ? position : 0;
    }

    private static long validateLength(Long length, long fileLength, long position) {
        if (length != null && length < 0) {
            throw LOGGER.throwableAtError().log("'length' cannot be negative.", IllegalArgumentException::new);
        }

        long maxAvailableLength = fileLength - position;

        // If a size has been set use the minimum of the remaining file size and size to determine the length.
        return (length == null) ? maxAvailableLength : Math.min(length, maxAvailableLength);
    }

    @Override
    public Long getLength() {
        return this.length;
    }

    /**
     * Gets the position, or offset, within the path where reading begins.
     *
     * @return The position, or offset, within the path where reading begins.
     */
    public long getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return new String(toBytes(), StandardCharsets.UTF_8);
    }

    @Override
    public byte[] toBytes() {
        if (length > MAX_ARRAY_SIZE) {
            throw LOGGER.throwableAtError().log(TOO_LARGE_FOR_BYTE_ARRAY + length, IllegalStateException::new);
        }

        return BYTES_UPDATER.updateAndGet(this, bytes -> bytes == null ? getBytes() : bytes);
    }

    @Override
    public <T> T toObject(Type type, ObjectSerializer serializer) {
        try {
            return serializer.deserializeFromStream(toStream(), type);
        } catch (IOException e) {
            throw LOGGER.throwableAtError().log(e, CoreException::from);
        }
    }

    @Override
    public InputStream toStream() {
        try {
            return new SliceInputStream(new BufferedInputStream(getFileInputStream(), chunkSize), position, length);
        } catch (FileNotFoundException e) {
            throw LOGGER.throwableAtError()
                .addKeyValue("file", file.toString())
                .log("File not found", e, CoreException::from);
        }
    }

    FileInputStream getFileInputStream() throws FileNotFoundException {
        return new FileInputStream(file.toFile());
    }

    @Override
    public ByteBuffer toByteBuffer() {
        if (length > MAX_ARRAY_SIZE) {
            throw LOGGER.throwableAtError().log(TOO_LARGE_FOR_BYTE_ARRAY + length, IllegalStateException::new);
        }

        return toByteBufferInternal();
    }

    @Override
    public void writeTo(OutputStream outputStream) {
        writeTo(Channels.newChannel(outputStream));
    }

    @Override
    public void writeTo(WritableByteChannel channel) {
        try (FileChannel fileChannel = FileChannel.open(file)) {
            fileChannel.transferTo(position, length, channel);
        } catch (IOException exception) {
            throw LOGGER.throwableAtError().log(exception, CoreException::from);
        }
    }

    @Override
    public void writeTo(JsonWriter jsonWriter) {
        Objects.requireNonNull(jsonWriter, "'jsonWriter' cannot be null");

        try {
            jsonWriter.writeBinary(toBytes());
        } catch (IOException e) {
            throw LOGGER.throwableAtError().log(e, CoreException::from);
        }
    }

    ByteBuffer toByteBufferInternal() {
        /*
         * A mapping, once established, is not dependent upon the file channel that was used to create it.
         * Closing the channel, in particular, has no effect upon the validity of the mapping.
         */
        try (FileChannel fileChannel = FileChannel.open(file)) {
            return fileChannel.map(FileChannel.MapMode.READ_ONLY, position, length);
        } catch (IOException exception) {
            throw LOGGER.throwableAtError().log(exception, CoreException::from);
        }
    }

    /**
     * Gets the file that this content represents.
     *
     * @return The file that this content represents.
     */
    public Path getFile() {
        return file;
    }

    @Override
    public boolean isReplayable() {
        return true;
    }

    @Override
    public BinaryData toReplayableBinaryData() {
        return this;
    }

    private byte[] getBytes() {
        if (length > MAX_ARRAY_SIZE) {
            throw LOGGER.throwableAtError().log(TOO_LARGE_FOR_BYTE_ARRAY + length, IllegalStateException::new);
        }

        try (InputStream is = this.toStream()) {
            byte[] bytes = new byte[(int) length];
            int pendingBytes = bytes.length;
            int offset = 0;
            do {
                // This usually reads in one shot.
                int read = is.read(bytes, offset, pendingBytes);
                if (read >= 0) {
                    pendingBytes -= read;
                    offset += read;
                } else {
                    throw LOGGER.throwableAtError()
                        .log("Premature EOF. File was modified concurrently.", IllegalStateException::new);
                }
            } while (pendingBytes > 0);
            return bytes;
        } catch (IOException exception) {
            throw LOGGER.throwableAtError().log(exception, CoreException::from);
        }
    }

    @Override
    public void close() {
        // Since this uses a Path, there is nothing to close, therefore no-op.
    }
}
