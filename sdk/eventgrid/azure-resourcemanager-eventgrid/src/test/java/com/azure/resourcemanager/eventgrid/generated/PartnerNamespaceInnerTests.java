// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PartnerNamespaceInner;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicRoutingMode;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PartnerNamespaceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PartnerNamespaceInner model = BinaryData.fromString(
            "{\"properties\":{\"privateEndpointConnections\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"hvjhhnakzyb\"},\"groupIds\":[\"idjks\"],\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"vxevblb\",\"actionsRequired\":\"dnlj\"},\"provisioningState\":\"Canceled\"},\"id\":\"euaulxu\",\"name\":\"smjbnkppxyn\",\"type\":\"nlsvxeiz\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"lnsrmffe\"},\"groupIds\":[\"ckt\",\"iymerteeammxqi\",\"kk\",\"zddrt\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"bmxva\",\"actionsRequired\":\"efdeesve\"},\"provisioningState\":\"Deleting\"},\"id\":\"jpxtxsuwprtuj\",\"name\":\"sawddjibabxvi\",\"type\":\"itvtzeexavo\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"lecdmdqbw\"},\"groupIds\":[\"q\",\"gsfjac\",\"slhhxudbxv\"],\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"sirudhzmmesckdlp\",\"actionsRequired\":\"zrcxfailcfxwmdbo\"},\"provisioningState\":\"Failed\"},\"id\":\"gsftufqobrjlnacg\",\"name\":\"ckknhxkizvy\",\"type\":\"nrzvuljraaer\"}],\"provisioningState\":\"Succeeded\",\"partnerRegistrationFullyQualifiedId\":\"qgukkjqnv\",\"minimumTlsVersionAllowed\":\"1.0\",\"endpoint\":\"laxxulc\",\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"fj\",\"action\":\"Allow\"},{\"ipMask\":\"g\",\"action\":\"Allow\"}],\"disableLocalAuth\":false,\"partnerTopicRoutingMode\":\"SourceEventAttribute\"},\"location\":\"cytdclxgccknfnwm\",\"tags\":{\"edxihchrphkmcrj\":\"vpdvjdhttzae\",\"kdghrjeuutlwx\":\"qnsdfzpbgtgky\",\"zhokvbwnhh\":\"z\",\"pipifh\":\"qlgehg\"},\"id\":\"f\",\"name\":\"oajvgcxtxjcs\",\"type\":\"eafidltugsresm\"}")
            .toObject(PartnerNamespaceInner.class);
        Assertions.assertEquals("cytdclxgccknfnwm", model.location());
        Assertions.assertEquals("vpdvjdhttzae", model.tags().get("edxihchrphkmcrj"));
        Assertions.assertEquals("qgukkjqnv", model.partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("fj", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE, model.partnerTopicRoutingMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PartnerNamespaceInner model = new PartnerNamespaceInner().withLocation("cytdclxgccknfnwm")
            .withTags(mapOf("edxihchrphkmcrj", "vpdvjdhttzae", "kdghrjeuutlwx", "qnsdfzpbgtgky", "zhokvbwnhh", "z",
                "pipifh", "qlgehg"))
            .withPartnerRegistrationFullyQualifiedId("qgukkjqnv")
            .withMinimumTlsVersionAllowed(TlsVersion.ONE_ZERO)
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
            .withInboundIpRules(Arrays.asList(new InboundIpRule().withIpMask("fj").withAction(IpActionType.ALLOW),
                new InboundIpRule().withIpMask("g").withAction(IpActionType.ALLOW)))
            .withDisableLocalAuth(false)
            .withPartnerTopicRoutingMode(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE);
        model = BinaryData.fromObject(model).toObject(PartnerNamespaceInner.class);
        Assertions.assertEquals("cytdclxgccknfnwm", model.location());
        Assertions.assertEquals("vpdvjdhttzae", model.tags().get("edxihchrphkmcrj"));
        Assertions.assertEquals("qgukkjqnv", model.partnerRegistrationFullyQualifiedId());
        Assertions.assertEquals(TlsVersion.ONE_ZERO, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("fj", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(PartnerTopicRoutingMode.SOURCE_EVENT_ATTRIBUTE, model.partnerTopicRoutingMode());
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
