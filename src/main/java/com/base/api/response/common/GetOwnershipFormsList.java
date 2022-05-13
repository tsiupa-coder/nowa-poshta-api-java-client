package com.base.api.response.common;

import com.base.api.model.common.OwnershipForms;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetOwnershipFormsList extends Response {
    boolean success;
    ArrayList<OwnershipForms> data;
    ArrayList<String> errors;
}
