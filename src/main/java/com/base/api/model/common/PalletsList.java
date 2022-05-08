package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PalletsList {
    @SerializedName("Ref")
    public String ref;
    @SerializedName("Description")
    public String description;
    @SerializedName("DescriptionRu")
    public String descriptionRu;
    @SerializedName("Weight")
    public String weight;
}
