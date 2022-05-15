package com.base.api.response.info.scansheet;

import com.base.api.model.scansheet.DeleteScan;
import com.base.api.model.scansheet.ScanSheet;
import com.base.api.response.general.Response;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeleteScanSheet extends Response {
    ArrayList<DeleteScan> data;
}
