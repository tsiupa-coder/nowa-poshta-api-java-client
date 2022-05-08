package com.base.api.model.city;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataCompanyCity {

    @SerializedName("Description")
    String description;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("Ref")
    String ref;
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
    @SerializedName("Area")
    String area;
    @SerializedName("SettlementType")
    String settlementType;
    @SerializedName("IsBranch")
    String isBranch;
    @SerializedName("PreventEntryNewStreetsUser")
    String preventEntryNewStreetsUser;
    @SerializedName("Conglomerates")
    String conglomerates;
    @SerializedName("CityID")
    String cityID;
    @SerializedName("SettlementTypeDescriptionRu")
    String settlementTypeDescriptionRu;
    @SerializedName("SettlementTypeDescription")
    String settlementTypeDescription;
}
