package com.base.api.model.region;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @SerializedName("Ref")
    String ref;
    @SerializedName("AreasCenter")
    String areasCenter;
    @SerializedName("DescriptionRu")
    String descriptionRu;
    @SerializedName("Description")
    String description;
}
