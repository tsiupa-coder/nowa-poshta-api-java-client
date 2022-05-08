package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TiresWheels {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("Weight")
    String weight;
    @SerializedName("DescriptionType")
    String descriptionType;
}
