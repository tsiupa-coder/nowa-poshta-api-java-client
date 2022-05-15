package com.base.api.model.addresses.address;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    @SerializedName("SettlementRef")
    String settlementRef;
    @SerializedName("SettlementStreetRef")
    String settlementStreetRef;
    @SerializedName("SettlementStreetDescription")
    String settlementStreetDescription;
    @SerializedName("Present")
    String present;
    @SerializedName("StreetsType")
    String streetsType;
    @SerializedName("StreetsTypeDescription")
    String streetsTypeDescription;
    @SerializedName("Location")
    Location location;
    @SerializedName("SettlementStreetDescriptionRu")
    String settlementStreetDescriptionRu;
}
