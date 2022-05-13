package com.base.api.response.common;

import com.base.api.model.common.TimeInterval;
import com.base.api.response.address.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetTimeIntervals extends Response {
    boolean success;
    ArrayList<TimeInterval> data;
    ArrayList<String> errors;
}
