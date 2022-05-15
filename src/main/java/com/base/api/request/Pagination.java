package com.base.api.request;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pagination {

    @SerializedName("Limit")
    Integer limit;
    @SerializedName("Page")
    Integer page;

}
