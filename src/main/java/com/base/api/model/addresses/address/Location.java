package com.base.api.model.addresses.address;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Location {
    public double lat;
    public double lon;
}

