package com.base.api.model.tracking;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleDocument {

    @SerializedName("DocumentNumber")
    String documentNumber;

    @SerializedName("Phone")
    String phone;
}
