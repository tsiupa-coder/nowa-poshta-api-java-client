package com.base.api.model.addresses.warehouse;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleWarehouse {

    String CityName;
    String CityRef;
    String Language;
    String TypeOfWarehouseRef;
    String WarehouseId;
}
