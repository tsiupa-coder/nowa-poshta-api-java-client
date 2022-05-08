package com.base.api.model.street;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SimpleStreet {
    String CityRef;
    String FindByString;
}
