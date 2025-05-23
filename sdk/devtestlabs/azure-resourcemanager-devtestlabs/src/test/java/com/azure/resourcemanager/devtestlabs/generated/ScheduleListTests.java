// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.ScheduleList;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"evfyexfwhybcib\",\"weeklyRecurrence\":{\"weekdays\":[\"c\"],\"time\":\"tynnaamdectehfi\"},\"dailyRecurrence\":{\"time\":\"jeyp\"},\"hourlyRecurrence\":{\"minute\":1363658384},\"timeZoneId\":\"kgqhcjrefovg\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":1096221203,\"webhookUrl\":\"yvxyqjp\",\"emailRecipient\":\"attpngjcrcczsq\",\"notificationLocale\":\"hvmdajvnysounq\"},\"createdDate\":\"2021-07-16T12:10:28Z\",\"targetResourceId\":\"oaeupfhyhltrpmo\",\"provisioningState\":\"mcmatuokthfuiu\",\"uniqueIdentifier\":\"dsfcpkvxodpuoz\"},\"location\":\"yzydagfuaxbezyi\",\"tags\":{\"dxwzywqsmbsurexi\":\"ktwh\",\"yocf\":\"o\",\"uxh\":\"fksymddystki\"},\"id\":\"yudxorrqnbp\",\"name\":\"czvyifq\",\"type\":\"vkd\"},{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"lrmv\",\"weeklyRecurrence\":{\"weekdays\":[\"atkpnp\",\"lexxbczwtru\",\"iqzbq\",\"vsovmyokac\"],\"time\":\"kwlhzdo\"},\"dailyRecurrence\":{\"time\":\"jmflbvvnch\"},\"hourlyRecurrence\":{\"minute\":682758161},\"timeZoneId\":\"wwzjuqkhrsajiwku\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":1637974204,\"webhookUrl\":\"sauuimj\",\"emailRecipient\":\"xieduugidyjrr\",\"notificationLocale\":\"y\"},\"createdDate\":\"2021-05-02T14:53:40Z\",\"targetResourceId\":\"e\",\"provisioningState\":\"sonpclhocohs\",\"uniqueIdentifier\":\"ev\"},\"location\":\"eggzfb\",\"tags\":{\"vmezy\":\"mvfaxkffeiith\",\"burvjxxjnspy\":\"shxmzsbbzoggigrx\",\"udwtiukbl\":\"ptkoenkoukn\",\"o\":\"ngkpocipazy\"},\"id\":\"gukgjnpiucgygevq\",\"name\":\"ntypmrbpizcdrqj\",\"type\":\"dpydn\"},{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"de\",\"weeklyRecurrence\":{\"weekdays\":[\"icwifsjtt\"],\"time\":\"fbishcbkha\"},\"dailyRecurrence\":{\"time\":\"yeamdphagalpb\"},\"hourlyRecurrence\":{\"minute\":605545221},\"timeZoneId\":\"pwhonowkg\",\"notificationSettings\":{\"status\":\"Disabled\",\"timeInMinutes\":595861111,\"webhookUrl\":\"xzbinjeputt\",\"emailRecipient\":\"ywnuzoq\",\"notificationLocale\":\"iyqzrnk\"},\"createdDate\":\"2021-04-18T03:15:34Z\",\"targetResourceId\":\"xlwhzlsicoh\",\"provisioningState\":\"qnwvlrya\",\"uniqueIdentifier\":\"hheunmmqhgyx\"},\"location\":\"konocu\",\"tags\":{\"nuqszfkbey\":\"lyaxuc\",\"senhwlrs\":\"ewrmjmwvvjektc\",\"qylihkaetckt\":\"frzpwvlqdqgb\"},\"id\":\"fcivfsnkym\",\"name\":\"ctq\",\"type\":\"jf\"},{\"properties\":{\"status\":\"Enabled\",\"taskType\":\"jcxerfuwu\",\"weeklyRecurrence\":{\"weekdays\":[\"fvjrbirphxepcy\",\"ahfn\",\"jky\"],\"time\":\"j\"},\"dailyRecurrence\":{\"time\":\"j\"},\"hourlyRecurrence\":{\"minute\":1347060120},\"timeZoneId\":\"kgj\",\"notificationSettings\":{\"status\":\"Enabled\",\"timeInMinutes\":831407974,\"webhookUrl\":\"cltbgsncghkjesz\",\"emailRecipient\":\"bijhtxfvgxbf\",\"notificationLocale\":\"xnehmpvec\"},\"createdDate\":\"2021-06-15T22:18:20Z\",\"targetResourceId\":\"ebfqkkrbm\",\"provisioningState\":\"kgriwflzlfbx\",\"uniqueIdentifier\":\"uzycispnqza\"},\"location\":\"mgkbrpyydhibn\",\"tags\":{\"agnb\":\"kpikadrgvt\",\"fsiarbutr\":\"ynhijggme\",\"jrunmpxtt\":\"vpnazzm\",\"bnlankxmyskpb\":\"bh\"},\"id\":\"enbtkcxywny\",\"name\":\"nrs\",\"type\":\"nlqidybyxczf\"}],\"nextLink\":\"haaxdbabphl\"}")
            .toObject(ScheduleList.class);
        Assertions.assertEquals("yzydagfuaxbezyi", model.value().get(0).location());
        Assertions.assertEquals("ktwh", model.value().get(0).tags().get("dxwzywqsmbsurexi"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).taskType());
        Assertions.assertEquals("c", model.value().get(0).weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("tynnaamdectehfi", model.value().get(0).weeklyRecurrence().time());
        Assertions.assertEquals("jeyp", model.value().get(0).dailyRecurrence().time());
        Assertions.assertEquals(1363658384, model.value().get(0).hourlyRecurrence().minute());
        Assertions.assertEquals("kgqhcjrefovg", model.value().get(0).timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).notificationSettings().status());
        Assertions.assertEquals(1096221203, model.value().get(0).notificationSettings().timeInMinutes());
        Assertions.assertEquals("yvxyqjp", model.value().get(0).notificationSettings().webhookUrl());
        Assertions.assertEquals("attpngjcrcczsq", model.value().get(0).notificationSettings().emailRecipient());
        Assertions.assertEquals("hvmdajvnysounq", model.value().get(0).notificationSettings().notificationLocale());
        Assertions.assertEquals("oaeupfhyhltrpmo", model.value().get(0).targetResourceId());
        Assertions.assertEquals("haaxdbabphl", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleList model
            = new ScheduleList().withValue(Arrays.asList(
                new ScheduleInner().withLocation("yzydagfuaxbezyi")
                    .withTags(mapOf("dxwzywqsmbsurexi", "ktwh", "yocf", "o", "uxh", "fksymddystki"))
                    .withStatus(EnableStatus.DISABLED)
                    .withTaskType("evfyexfwhybcib")
                    .withWeeklyRecurrence(
                        new WeekDetails().withWeekdays(Arrays.asList("c")).withTime("tynnaamdectehfi"))
                    .withDailyRecurrence(new DayDetails().withTime("jeyp"))
                    .withHourlyRecurrence(new HourDetails().withMinute(1363658384))
                    .withTimeZoneId("kgqhcjrefovg")
                    .withNotificationSettings(new NotificationSettings().withStatus(EnableStatus.ENABLED)
                        .withTimeInMinutes(1096221203)
                        .withWebhookUrl("yvxyqjp")
                        .withEmailRecipient("attpngjcrcczsq")
                        .withNotificationLocale("hvmdajvnysounq"))
                    .withTargetResourceId("oaeupfhyhltrpmo"),
                new ScheduleInner().withLocation("eggzfb")
                    .withTags(mapOf("vmezy", "mvfaxkffeiith", "burvjxxjnspy", "shxmzsbbzoggigrx", "udwtiukbl",
                        "ptkoenkoukn", "o", "ngkpocipazy"))
                    .withStatus(EnableStatus.ENABLED)
                    .withTaskType("lrmv")
                    .withWeeklyRecurrence(
                        new WeekDetails().withWeekdays(Arrays.asList("atkpnp", "lexxbczwtru", "iqzbq", "vsovmyokac"))
                            .withTime("kwlhzdo"))
                    .withDailyRecurrence(new DayDetails().withTime("jmflbvvnch"))
                    .withHourlyRecurrence(new HourDetails().withMinute(682758161))
                    .withTimeZoneId("wwzjuqkhrsajiwku")
                    .withNotificationSettings(new NotificationSettings()
                        .withStatus(EnableStatus.DISABLED)
                        .withTimeInMinutes(1637974204)
                        .withWebhookUrl("sauuimj")
                        .withEmailRecipient("xieduugidyjrr")
                        .withNotificationLocale("y"))
                    .withTargetResourceId("e"),
                new ScheduleInner().withLocation("konocu")
                    .withTags(
                        mapOf("nuqszfkbey", "lyaxuc", "senhwlrs", "ewrmjmwvvjektc", "qylihkaetckt", "frzpwvlqdqgb"))
                    .withStatus(EnableStatus.ENABLED)
                    .withTaskType("de")
                    .withWeeklyRecurrence(
                        new WeekDetails().withWeekdays(Arrays.asList("icwifsjtt")).withTime("fbishcbkha"))
                    .withDailyRecurrence(new DayDetails().withTime("yeamdphagalpb"))
                    .withHourlyRecurrence(new HourDetails().withMinute(605545221))
                    .withTimeZoneId("pwhonowkg")
                    .withNotificationSettings(new NotificationSettings().withStatus(EnableStatus.DISABLED)
                        .withTimeInMinutes(595861111)
                        .withWebhookUrl("xzbinjeputt")
                        .withEmailRecipient("ywnuzoq")
                        .withNotificationLocale("iyqzrnk"))
                    .withTargetResourceId("xlwhzlsicoh"),
                new ScheduleInner().withLocation("mgkbrpyydhibn")
                    .withTags(mapOf("agnb", "kpikadrgvt", "fsiarbutr", "ynhijggme", "jrunmpxtt", "vpnazzm",
                        "bnlankxmyskpb", "bh"))
                    .withStatus(EnableStatus.ENABLED)
                    .withTaskType("jcxerfuwu")
                    .withWeeklyRecurrence(
                        new WeekDetails().withWeekdays(Arrays.asList("fvjrbirphxepcy", "ahfn", "jky")).withTime("j"))
                    .withDailyRecurrence(new DayDetails().withTime("j"))
                    .withHourlyRecurrence(new HourDetails().withMinute(1347060120))
                    .withTimeZoneId("kgj")
                    .withNotificationSettings(new NotificationSettings().withStatus(EnableStatus.ENABLED)
                        .withTimeInMinutes(831407974)
                        .withWebhookUrl("cltbgsncghkjesz")
                        .withEmailRecipient("bijhtxfvgxbf")
                        .withNotificationLocale("xnehmpvec"))
                    .withTargetResourceId("ebfqkkrbm")))
                .withNextLink("haaxdbabphl");
        model = BinaryData.fromObject(model).toObject(ScheduleList.class);
        Assertions.assertEquals("yzydagfuaxbezyi", model.value().get(0).location());
        Assertions.assertEquals("ktwh", model.value().get(0).tags().get("dxwzywqsmbsurexi"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals("evfyexfwhybcib", model.value().get(0).taskType());
        Assertions.assertEquals("c", model.value().get(0).weeklyRecurrence().weekdays().get(0));
        Assertions.assertEquals("tynnaamdectehfi", model.value().get(0).weeklyRecurrence().time());
        Assertions.assertEquals("jeyp", model.value().get(0).dailyRecurrence().time());
        Assertions.assertEquals(1363658384, model.value().get(0).hourlyRecurrence().minute());
        Assertions.assertEquals("kgqhcjrefovg", model.value().get(0).timeZoneId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.value().get(0).notificationSettings().status());
        Assertions.assertEquals(1096221203, model.value().get(0).notificationSettings().timeInMinutes());
        Assertions.assertEquals("yvxyqjp", model.value().get(0).notificationSettings().webhookUrl());
        Assertions.assertEquals("attpngjcrcczsq", model.value().get(0).notificationSettings().emailRecipient());
        Assertions.assertEquals("hvmdajvnysounq", model.value().get(0).notificationSettings().notificationLocale());
        Assertions.assertEquals("oaeupfhyhltrpmo", model.value().get(0).targetResourceId());
        Assertions.assertEquals("haaxdbabphl", model.nextLink());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
