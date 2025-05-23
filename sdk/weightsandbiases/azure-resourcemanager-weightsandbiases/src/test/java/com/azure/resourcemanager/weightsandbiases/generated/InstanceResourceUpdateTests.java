// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.weightsandbiases.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.weightsandbiases.models.InstanceResourceUpdate;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentity;
import com.azure.resourcemanager.weightsandbiases.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.weightsandbiases.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class InstanceResourceUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstanceResourceUpdate model = BinaryData.fromString(
            "{\"tags\":{\"aop\":\"kfthwxmntei\",\"jcmmxdcufufsrp\":\"km\",\"sgfyccsnew\":\"mzidnsezcxtb\"},\"identity\":{\"principalId\":\"z\",\"tenantId\":\"iachbo\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"zvypyqrimzinp\":{\"principalId\":\"ro\",\"clientId\":\"qpteeh\"},\"t\":{\"principalId\":\"wjdk\",\"clientId\":\"soodqxhcrmnoh\"}}}}")
            .toObject(InstanceResourceUpdate.class);
        Assertions.assertEquals("kfthwxmntei", model.tags().get("aop"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstanceResourceUpdate model = new InstanceResourceUpdate()
            .withTags(mapOf("aop", "kfthwxmntei", "jcmmxdcufufsrp", "km", "sgfyccsnew", "mzidnsezcxtb"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("zvypyqrimzinp", new UserAssignedIdentity(), "t", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(InstanceResourceUpdate.class);
        Assertions.assertEquals("kfthwxmntei", model.tags().get("aop"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
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
