package com.base.api.model.additionalservice;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersListRequest {
    @SerializedName("Number")
    String number;
    @SerializedName("Ref")
    String ref;
    @SerializedName("BeginDate")
    String beginDate;
    @SerializedName("EndDate")
    String endDate;
    @SerializedName("Page")
    String page;
    @SerializedName("Limit")
    String limit;
}
