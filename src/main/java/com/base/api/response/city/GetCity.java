package com.base.api.response.city;

import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class GetCity extends Response {
    boolean success;
    ArrayList<Count> data;
    ArrayList<String> errors;
    ArrayList<String> warnings;
    ArrayList<String> info;
    ArrayList<String> messageCodes;
    ArrayList<String> errorCodes;
    ArrayList<String> warningCodes;
    ArrayList<String> infoCodes;
}


