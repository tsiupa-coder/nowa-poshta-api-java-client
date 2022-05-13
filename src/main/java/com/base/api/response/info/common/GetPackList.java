package com.base.api.response.info.common;

import com.base.api.model.common.PackList;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetPackList extends Response {
    ArrayList<PackList> data;
}
