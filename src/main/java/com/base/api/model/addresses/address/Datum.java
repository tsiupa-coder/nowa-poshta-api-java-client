package com.base.api.model.addresses.address;

import com.google.gson.annotations.SerializedName;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Datum {
    @SerializedName("TotalCount")
    public int totalCount;
    @SerializedName("Addresses")
    public ArrayList<Address> addresses;
}
