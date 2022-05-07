package com.base.api.request;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class MethodProperties {

    @SerializedName("CityName")
    private String cityName;

    @SerializedName("StreetName")
    private String streetName;

    @SerializedName("SettlementRef")
    private String settlementRef;

    @SerializedName("Limit")
    private Integer limit;
    @SerializedName("Page")
    private Integer page;


    //create address
    @SerializedName("CounterpartyRef")
    String counterpartyRef;

    @SerializedName("StreetRef")
    String streetRef;

    @SerializedName("BuildingNumber")
    String buildingNumber;

    @SerializedName("Flat")
    String flat;

    @SerializedName("Note")
    String note;

    //find any city, village, or anything where nova poshta can find
    @SerializedName("AreaRef")
    String areaRef;

    @SerializedName("Ref")
    String ref;

    @SerializedName("RegionRef")
    String regionRef;

    @SerializedName("Warehouse")
    String warehouse;

    @SerializedName("FindByString")
    String findByString;
}
