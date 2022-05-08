package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CargoDescription {
    @SerializedName("Description")
    String description;
    @SerializedName("Ref")
    String ref;

    @SerializedName("DescriptionRu")
    String descriptionRu;
}
