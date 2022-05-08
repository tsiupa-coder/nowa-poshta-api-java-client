package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PackList {
    @SerializedName("Ref")
    public String ref;
    @SerializedName("Description")
    public String description;
    @SerializedName("DescriptionRu")
    public String descriptionRu;
    @SerializedName("Length")
    public String length;
    @SerializedName("Width")
    public String width;
    @SerializedName("Height")
    public String height;
    @SerializedName("VolumetricWeight")
    public String volumetricWeight;
    @SerializedName("TypeOfPacking")
    public String typeOfPacking;
}
