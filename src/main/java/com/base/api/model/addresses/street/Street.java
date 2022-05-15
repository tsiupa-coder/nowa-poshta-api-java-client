package com.base.api.model.addresses.street;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Street {
    @SerializedName("Ref")
    String ref;
    @SerializedName("Description")
    String description;
    @SerializedName("StreetsTypeRef")
    String streetsTypeRef;
    @SerializedName("StreetsType")
    String streetsType;
}
