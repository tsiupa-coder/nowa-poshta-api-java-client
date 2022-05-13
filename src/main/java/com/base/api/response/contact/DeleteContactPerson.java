package com.base.api.response.contact;

import com.base.api.model.contact.Reference;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeleteContactPerson extends Response {
    boolean success;
    ArrayList<Reference> data;
    ArrayList<String> errors;
}
