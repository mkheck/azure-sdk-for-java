// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklySchedule;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WeeklyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeeklySchedule model = BinaryData.fromString(
            "{\"scheduleRunDays\":[\"Thursday\",\"Thursday\",\"Saturday\"],\"scheduleRunTimes\":[\"2021-06-25T03:22:55Z\",\"2021-01-26T03:37:20Z\",\"2021-01-15T14:04:55Z\"]}")
            .toObject(WeeklySchedule.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T03:22:55Z"), model.scheduleRunTimes().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeeklySchedule model = new WeeklySchedule()
            .withScheduleRunDays(Arrays.asList(DayOfWeek.THURSDAY, DayOfWeek.THURSDAY, DayOfWeek.SATURDAY))
            .withScheduleRunTimes(Arrays.asList(OffsetDateTime.parse("2021-06-25T03:22:55Z"),
                OffsetDateTime.parse("2021-01-26T03:37:20Z"), OffsetDateTime.parse("2021-01-15T14:04:55Z")));
        model = BinaryData.fromObject(model).toObject(WeeklySchedule.class);
        Assertions.assertEquals(DayOfWeek.THURSDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T03:22:55Z"), model.scheduleRunTimes().get(0));
    }
}
