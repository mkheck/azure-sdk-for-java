// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billingbenefits.fluent.models.ReservationOrderAliasRequestProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.InstanceFlexibility;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequestPropertiesReservedResourceProperties;
import com.azure.resourcemanager.billingbenefits.models.ReservedResourceType;
import com.azure.resourcemanager.billingbenefits.models.Term;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ReservationOrderAliasRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationOrderAliasRequestProperties model = BinaryData.fromString(
            "{\"displayName\":\"gigr\",\"billingScopeId\":\"burvjxxjnspy\",\"term\":\"P3Y\",\"billingPlan\":\"P1M\",\"appliedScopeType\":\"Shared\",\"appliedScopeProperties\":{\"tenantId\":\"uknvudwti\",\"managementGroupId\":\"bldngkpoc\",\"subscriptionId\":\"azyxoegukg\",\"resourceGroupId\":\"piu\",\"displayName\":\"ygevqzntypmrbpiz\"},\"quantity\":71732550,\"renew\":false,\"reservedResourceType\":\"SapHana\",\"reviewDateTime\":\"2021-02-05T11:01:53Z\",\"reservedResourceProperties\":{\"instanceFlexibility\":\"On\"}}")
            .toObject(ReservationOrderAliasRequestProperties.class);
        Assertions.assertEquals("gigr", model.displayName());
        Assertions.assertEquals("burvjxxjnspy", model.billingScopeId());
        Assertions.assertEquals(Term.P3Y, model.term());
        Assertions.assertEquals(BillingPlan.P1M, model.billingPlan());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("uknvudwti", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("bldngkpoc", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("azyxoegukg", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("piu", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("ygevqzntypmrbpiz", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(71732550, model.quantity());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(ReservedResourceType.SAP_HANA, model.reservedResourceType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-05T11:01:53Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationOrderAliasRequestProperties model
            = new ReservationOrderAliasRequestProperties().withDisplayName("gigr")
                .withBillingScopeId("burvjxxjnspy")
                .withTerm(Term.P3Y)
                .withBillingPlan(BillingPlan.P1M)
                .withAppliedScopeType(AppliedScopeType.SHARED)
                .withAppliedScopeProperties(new AppliedScopeProperties().withTenantId("uknvudwti")
                    .withManagementGroupId("bldngkpoc")
                    .withSubscriptionId("azyxoegukg")
                    .withResourceGroupId("piu")
                    .withDisplayName("ygevqzntypmrbpiz"))
                .withQuantity(71732550)
                .withRenew(false)
                .withReservedResourceType(ReservedResourceType.SAP_HANA)
                .withReviewDateTime(OffsetDateTime.parse("2021-02-05T11:01:53Z"))
                .withReservedResourceProperties(new ReservationOrderAliasRequestPropertiesReservedResourceProperties()
                    .withInstanceFlexibility(InstanceFlexibility.ON));
        model = BinaryData.fromObject(model).toObject(ReservationOrderAliasRequestProperties.class);
        Assertions.assertEquals("gigr", model.displayName());
        Assertions.assertEquals("burvjxxjnspy", model.billingScopeId());
        Assertions.assertEquals(Term.P3Y, model.term());
        Assertions.assertEquals(BillingPlan.P1M, model.billingPlan());
        Assertions.assertEquals(AppliedScopeType.SHARED, model.appliedScopeType());
        Assertions.assertEquals("uknvudwti", model.appliedScopeProperties().tenantId());
        Assertions.assertEquals("bldngkpoc", model.appliedScopeProperties().managementGroupId());
        Assertions.assertEquals("azyxoegukg", model.appliedScopeProperties().subscriptionId());
        Assertions.assertEquals("piu", model.appliedScopeProperties().resourceGroupId());
        Assertions.assertEquals("ygevqzntypmrbpiz", model.appliedScopeProperties().displayName());
        Assertions.assertEquals(71732550, model.quantity());
        Assertions.assertEquals(false, model.renew());
        Assertions.assertEquals(ReservedResourceType.SAP_HANA, model.reservedResourceType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-05T11:01:53Z"), model.reviewDateTime());
        Assertions.assertEquals(InstanceFlexibility.ON, model.reservedResourceProperties().instanceFlexibility());
    }
}
