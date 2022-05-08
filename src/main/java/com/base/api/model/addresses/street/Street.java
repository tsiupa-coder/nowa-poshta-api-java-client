package com.base.api.model.addresses.street;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Street {
    @SerializedName("Ref")
    public String ref;
    @SerializedName("Description")
    public String description;
    @SerializedName("StreetsTypeRef")
    public String streetsTypeRef;
    @SerializedName("StreetsType")
    public String streetsType;
}
