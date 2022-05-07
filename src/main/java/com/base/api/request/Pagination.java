package com.base.api.request;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pagination {

    @SerializedName("Limit")
    private Integer limit;
    @SerializedName("Page")
    private Integer page;

}
