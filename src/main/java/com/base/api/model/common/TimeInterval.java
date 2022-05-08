package com.base.api.model.common;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TimeInterval {

    @SerializedName("Number")
    String number;
    @SerializedName("Start")
    String start;
    @SerializedName("End")
    String end;
}
