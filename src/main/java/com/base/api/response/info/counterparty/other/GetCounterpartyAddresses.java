package com.base.api.response.info.counterparty.other;

import com.base.api.model.counterparty.other.CounterpartyAddress;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCounterpartyAddresses extends Response {
    ArrayList<CounterpartyAddress> data;
}
