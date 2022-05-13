package com.base.api.response.info.counterparty.updata;

import com.base.api.model.SimpleResponse;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeleteCounterparty extends Response {
    ArrayList<SimpleResponse> data;
}
