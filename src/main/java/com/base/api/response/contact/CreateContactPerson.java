package com.base.api.response.contact;

import com.base.api.model.common.CargoDescription;
import com.base.api.model.contact.ContactPerson;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateContactPerson extends Response {
    boolean success;
    ArrayList<ContactPerson> data;
    ArrayList<String> errors;
}
