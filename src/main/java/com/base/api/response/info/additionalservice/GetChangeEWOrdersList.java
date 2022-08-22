package com.base.api.response.info.additionalservice;

import com.base.api.model.additionalservice.ChangeEWOrders;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetChangeEWOrdersList extends Response {
    ArrayList<ChangeEWOrders> data;

}
