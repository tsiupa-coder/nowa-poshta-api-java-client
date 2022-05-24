package com.base.api.model;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Simple2Response {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Number")
    String number;
}
