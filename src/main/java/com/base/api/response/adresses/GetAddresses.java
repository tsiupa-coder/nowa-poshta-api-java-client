package com.base.api.response.adresses;

import com.base.api.model.address.Datum;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetAddresses extends Response {
    public boolean success;
    public ArrayList<Datum> data;
    public ArrayList<String> errors;
    public ArrayList<String> warnings;
    public ArrayList<String> info;
    public ArrayList<String> messageCodes;
    public ArrayList<String> errorCodes;
    public ArrayList<String> warningCodes;
    public ArrayList<String> infoCodes;
}
