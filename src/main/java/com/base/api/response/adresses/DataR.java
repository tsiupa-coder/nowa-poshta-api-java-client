package com.base.api.response.adresses;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@lombok.Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataR {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
}
