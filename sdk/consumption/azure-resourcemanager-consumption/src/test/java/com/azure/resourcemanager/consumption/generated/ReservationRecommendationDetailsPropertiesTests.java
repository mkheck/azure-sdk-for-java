// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationDetailsProperties;

public final class ReservationRecommendationDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationRecommendationDetailsProperties model = BinaryData.fromString(
            "{\"currency\":\"ckw\",\"resource\":{\"appliedScopes\":[\"whxxbuyqax\",\"feqztppriol\",\"or\",\"altol\"],\"onDemandRate\":53.189575,\"product\":\"sobqw\",\"region\":\"dbnw\",\"reservationRate\":57.03069,\"resourceType\":\"ucqdpfuvglsb\"},\"resourceGroup\":\"ca\",\"savings\":{\"calculatedSavings\":[{\"onDemandCost\":5.491209,\"overageCost\":40.676033,\"quantity\":40.539593,\"reservationCost\":81.38178,\"totalReservationCost\":95.19054,\"reservedUnitCount\":6.3495455,\"savings\":72.175766},{\"onDemandCost\":81.68057,\"overageCost\":45.506947,\"quantity\":64.57355,\"reservationCost\":89.525856,\"totalReservationCost\":6.2122107,\"reservedUnitCount\":13.341737,\"savings\":8.401269},{\"onDemandCost\":6.1545014,\"overageCost\":37.783005,\"quantity\":57.222305,\"reservationCost\":64.271286,\"totalReservationCost\":86.975746,\"reservedUnitCount\":52.051018,\"savings\":86.93388},{\"onDemandCost\":4.3171763,\"overageCost\":47.378044,\"quantity\":29.38741,\"reservationCost\":67.73856,\"totalReservationCost\":33.748688,\"reservedUnitCount\":17.710728,\"savings\":55.13466}],\"lookBackPeriod\":103703544,\"recommendedQuantity\":69.335175,\"reservationOrderTerm\":\"uwjuetaeburuvdmo\",\"savingsType\":\"mz\",\"unitOfMeasure\":\"wabm\"},\"scope\":\"efkifr\",\"usage\":{\"firstConsumptionDate\":\"u\",\"lastConsumptionDate\":\"jmqlgkfb\",\"lookBackUnitType\":\"doaon\",\"usageData\":[6.8924847,25.553173],\"usageGrain\":\"ujitcjedftww\"}}")
            .toObject(ReservationRecommendationDetailsProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationRecommendationDetailsProperties model = new ReservationRecommendationDetailsProperties();
        model = BinaryData.fromObject(model).toObject(ReservationRecommendationDetailsProperties.class);
    }
}
