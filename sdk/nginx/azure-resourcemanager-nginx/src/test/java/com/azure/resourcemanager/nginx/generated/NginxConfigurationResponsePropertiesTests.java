// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxConfigurationFile;
import com.azure.resourcemanager.nginx.models.NginxConfigurationPackage;
import com.azure.resourcemanager.nginx.models.NginxConfigurationProtectedFileResponse;
import com.azure.resourcemanager.nginx.models.NginxConfigurationResponseProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NginxConfigurationResponsePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxConfigurationResponseProperties model = BinaryData.fromString(
            "{\"provisioningState\":\"Failed\",\"files\":[{\"content\":\"ahbc\",\"virtualPath\":\"ffdfdosygexpa\"}],\"protectedFiles\":[{\"virtualPath\":\"hmsbzjhcrzevdp\",\"contentHash\":\"xaolth\"},{\"virtualPath\":\"rgqjbpfzfsinzg\",\"contentHash\":\"cjrwzoxxjtfellu\"},{\"virtualPath\":\"zitonpeqfpjkjl\",\"contentHash\":\"fpdvhpfxxypi\"}],\"package\":{\"data\":\"mayhuybbkpodepoo\",\"protectedFiles\":[\"uvamiheognarxzxt\",\"eotusivyevc\",\"iqihn\"]},\"rootFile\":\"ngbwjz\"}")
            .toObject(NginxConfigurationResponseProperties.class);
        Assertions.assertEquals("ahbc", model.files().get(0).content());
        Assertions.assertEquals("ffdfdosygexpa", model.files().get(0).virtualPath());
        Assertions.assertEquals("hmsbzjhcrzevdp", model.protectedFiles().get(0).virtualPath());
        Assertions.assertEquals("xaolth", model.protectedFiles().get(0).contentHash());
        Assertions.assertEquals("mayhuybbkpodepoo", model.packageProperty().data());
        Assertions.assertEquals("uvamiheognarxzxt", model.packageProperty().protectedFiles().get(0));
        Assertions.assertEquals("ngbwjz", model.rootFile());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxConfigurationResponseProperties model = new NginxConfigurationResponseProperties()
            .withFiles(Arrays.asList(new NginxConfigurationFile().withContent("ahbc").withVirtualPath("ffdfdosygexpa")))
            .withProtectedFiles(Arrays.asList(
                new NginxConfigurationProtectedFileResponse().withVirtualPath("hmsbzjhcrzevdp")
                    .withContentHash("xaolth"),
                new NginxConfigurationProtectedFileResponse().withVirtualPath("rgqjbpfzfsinzg")
                    .withContentHash("cjrwzoxxjtfellu"),
                new NginxConfigurationProtectedFileResponse().withVirtualPath("zitonpeqfpjkjl")
                    .withContentHash("fpdvhpfxxypi")))
            .withPackageProperty(new NginxConfigurationPackage().withData("mayhuybbkpodepoo")
                .withProtectedFiles(Arrays.asList("uvamiheognarxzxt", "eotusivyevc", "iqihn")))
            .withRootFile("ngbwjz");
        model = BinaryData.fromObject(model).toObject(NginxConfigurationResponseProperties.class);
        Assertions.assertEquals("ahbc", model.files().get(0).content());
        Assertions.assertEquals("ffdfdosygexpa", model.files().get(0).virtualPath());
        Assertions.assertEquals("hmsbzjhcrzevdp", model.protectedFiles().get(0).virtualPath());
        Assertions.assertEquals("xaolth", model.protectedFiles().get(0).contentHash());
        Assertions.assertEquals("mayhuybbkpodepoo", model.packageProperty().data());
        Assertions.assertEquals("uvamiheognarxzxt", model.packageProperty().protectedFiles().get(0));
        Assertions.assertEquals("ngbwjz", model.rootFile());
    }
}
