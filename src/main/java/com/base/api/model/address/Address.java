package com.base.api.model.address;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    @SerializedName("SettlementRef")
    public String settlementRef;
    @SerializedName("SettlementStreetRef")
    public String settlementStreetRef;
    @SerializedName("SettlementStreetDescription")
    public String settlementStreetDescription;
    @SerializedName("Present")
    public String present;
    @SerializedName("StreetsType")
    public String streetsType;
    @SerializedName("StreetsTypeDescription")
    public String streetsTypeDescription;
    @SerializedName("Location")
    public Location location;
    @SerializedName("SettlementStreetDescriptionRu")
    public String settlementStreetDescriptionRu;
}
