package com.base.api.model.addresses.address;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DataR {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
}
