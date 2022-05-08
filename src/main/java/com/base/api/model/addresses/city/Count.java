package com.base.api.model.addresses.city;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Count {
    @SerializedName("TotalCount")
    int totalCount;
    @SerializedName("Addresses")
    ArrayList<City> addresses;
}
