package com.base.api.model.scansheet;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsertDocument {

    @SerializedName("Ref")
    String ref;
    @SerializedName("Number")
    String number;
    @SerializedName("Date")
    String date;

}
