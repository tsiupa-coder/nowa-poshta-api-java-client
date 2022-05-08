package com.base.api.model.addresses.city;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @SerializedName("Present")
    String present;
    @SerializedName("Warehouses")
    Integer warehouses;
    @SerializedName("MainDescription")
    String mainDescription;
    @SerializedName("Area")
    String area;
    @SerializedName("Region")
    String region;
    @SerializedName("SettlementTypeCode")
    String settlementTypeCode;
    @SerializedName("Ref")
    String ref;
    @SerializedName("DeliveryCity")
    String deliveryCity;
    @SerializedName("AddressDeliveryAllowed")
    Boolean addressDeliveryAllowed;
    @SerializedName("StreetsAvailability")
    Boolean streetsAvailability;
    @SerializedName("ParentRegionTypes")
    String parentRegionTypes;
    @SerializedName("ParentRegionCode")
    String parentRegionCode;
    @SerializedName("RegionTypes")
    String regionTypes;
    @SerializedName("RegionTypesCode")
    String regionTypesCode;
}
