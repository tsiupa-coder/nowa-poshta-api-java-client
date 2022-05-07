package com.base.api.response.adresses;


import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Data;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateAddress extends Response {
    boolean success;
    ArrayList<DataR> data;
    ArrayList<String> errors;

}