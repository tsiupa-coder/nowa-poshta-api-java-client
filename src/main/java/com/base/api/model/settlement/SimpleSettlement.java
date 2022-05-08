package com.base.api.model.settlement;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleSettlement {
    String AreaRef;
    String Ref;
    String RegionRef;
    String Warehouse;
    String FindByString;
}
