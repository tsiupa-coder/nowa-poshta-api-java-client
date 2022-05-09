package com.base.api.response.common;

import com.base.api.model.common.CargoDescription;
import com.base.api.model.common.MessageCodeText;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetMessageCodeText extends Response {
    boolean success;
    ArrayList<MessageCodeText> data;
    ArrayList<String> errors;
}