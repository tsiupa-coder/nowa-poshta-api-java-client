package com.base.api.response.tracking;

import com.base.api.model.tracking.StatusDocument;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetStatusDocuments extends Response {
    boolean success;
    ArrayList<StatusDocument> data;
    ArrayList<String> errors;
}
