package com.base.api.model.department;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Schedule {
    @SerializedName("Monday")
    String monday;
    @SerializedName("Tuesday")
    String tuesday;
    @SerializedName("Wednesday")
    String wednesday;
    @SerializedName("Thursday")
    String thursday;
    @SerializedName("Friday")
    String friday;
    @SerializedName("Saturday")
    String saturday;
    @SerializedName("Sunday")
    String sunday;
}
