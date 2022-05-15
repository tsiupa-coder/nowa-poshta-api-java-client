package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PackList {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("Length")
    String length;
    @SerializedName("Width")
    String width;
    @SerializedName("Height")
    String height;
    @SerializedName("VolumetricWeight")
    String volumetricWeight;
    @SerializedName("TypeOfPacking")
    String typeOfPacking;
}
