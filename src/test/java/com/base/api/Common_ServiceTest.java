package com.base.api;

import com.base.api.mainservice.Common_Service;
import com.base.api.request.Pagination;
import com.base.api.response.info.common.GetCargoDescriptionList;
import com.base.api.response.info.common.GetCargoTypes;
import com.base.api.response.info.common.GetMessageCodeText;
import com.base.api.response.info.common.GetPalletsList;
import com.base.api.response.info.common.GetServiceTypes;
import com.base.api.response.info.common.GetTiresWheelsList;
import com.base.api.response.info.common.GetTypesOfPayersForRedelivery;
import junit.framework.TestCase;

import java.io.IOException;

public class Common_ServiceTest extends TestCase {

    Common_Service service = new Common_Service();
    private final String API_KEY = "64db4746458023076ed38c878a0b398f";
    public void testGetTimeIntervals() {

    }

    public void testGetCargoTypes() throws IOException {
        GetCargoTypes info =  service.getCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetBackwardDeliveryCargoTypes() throws IOException {
        GetCargoTypes info = service.getBackwardDeliveryCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetPalletsList() throws IOException {
        GetPalletsList info = service.getPalletsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetTypesOfPayersForRedelivery() throws IOException {

        GetTypesOfPayersForRedelivery info = service.getTypesOfPayersForRedelivery(API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }

    public void testGetPackList() throws IOException {

        GetPalletsList  info = service.getPalletsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetTiresWheelsList() throws IOException {
        GetTiresWheelsList info = service.getTiresWheelsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetCargoDescriptionList() throws IOException {
        Pagination pagination = new Pagination();
        pagination.setPage(1);
        pagination.setLimit(100);
        GetCargoDescriptionList info = service.getCargoDescriptionList(null, pagination, API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }

    public void testGetMessageCodeText() throws IOException {
        GetMessageCodeText info = service.getMessageCodeText(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    public void testGetServiceTypes() throws IOException {

        GetServiceTypes info = service.getServiceTypes(API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }

    public void testGetOwnershipFormsList() {
    }
}