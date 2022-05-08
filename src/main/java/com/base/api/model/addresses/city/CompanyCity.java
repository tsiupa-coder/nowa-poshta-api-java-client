package com.base.api.model.addresses.city;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompanyCity {
    @SerializedName("Ref")
    String ref;
    @SerializedName("FindByString")
    String findByString;
}
