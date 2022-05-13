package com.base.api.response.info.counterparty.other;

import com.base.api.model.counterparty.update.Counterparty;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetCounterparties extends Response {
    ArrayList<Counterparty> data;
}
