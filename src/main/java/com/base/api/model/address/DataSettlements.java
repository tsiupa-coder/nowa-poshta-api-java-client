package com.base.api.model.address;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataSettlements {

    @SerializedName("Ref")
    String ref;
    @SerializedName("SettlementType")
    String settlementType;
    @SerializedName("Latitude")
    String latitude;
    @SerializedName("Longitude")
    String longitude;
    @SerializedName("Description")
    String description;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("SettlementTypeDescription")
    String settlementTypeDescription;
    @SerializedName("SettlementTypeDescriptionRu")
    String settlementTypeDescriptionRu;
    @SerializedName("Region")
    String region;
    @SerializedName("RegionsDescription")
    String regionsDescription;
    @SerializedName("RegionsDescriptionRu")
    String regionsDescriptionRu;
    @SerializedName("Area")
    String area;
    @SerializedName("AreaDescription")
    String areaDescription;
    @SerializedName("AreaDescriptionRu")
    String areaDescriptionRu;
    @SerializedName("Index1")
    String index1;
    @SerializedName("Index2")
    String index2;
    @SerializedName("IndexCOATSU1")
    String indexCOATSU1;
    @SerializedName("Delivery1")
    String delivery1;
    @SerializedName("Delivery2")
    String delivery2;
    @SerializedName("Delivery3")
    String delivery3;
    @SerializedName("Delivery4")
    String delivery4;
    @SerializedName("Delivery5")
    String delivery5;
    @SerializedName("Delivery6")
    String delivery6;
    @SerializedName("Delivery7")
    String delivery7;
    @SerializedName("Warehouse")
    String warehouse;
    @SerializedName("Conglomerates")
    ArrayList<String> conglomerates;
}
