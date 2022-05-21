package com.base.api.response.info.additionalservice;

import com.base.api.model.additionalservice.PossibilityCreate;
import com.base.api.model.additionalservice.ReturnOrder;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetReturnOrdersList extends Response {
    ArrayList<ReturnOrder> data;
}
