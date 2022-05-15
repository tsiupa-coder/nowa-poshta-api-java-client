package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeleteScan {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Number")
    String number;
    @SerializedName("Error")
    String error;

}
