package com.base.api.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Request {
    String apiKey;
    String modelName;
    String calledMethod;
    MethodProperties methodProperties;

}
