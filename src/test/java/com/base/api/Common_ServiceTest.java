package com.base.api;

import com.base.api.mainservice.Common_Service;
import com.base.api.request.Pagination;
import com.base.api.response.info.common.GetCargoDescriptionList;
import com.base.api.response.info.common.GetCargoTypes;
import com.base.api.response.info.common.GetMessageCodeText;
import com.base.api.response.info.common.GetOwnershipFormsList;
import com.base.api.response.info.common.GetPalletsList;
import com.base.api.response.info.common.GetServiceTypes;
import com.base.api.response.info.common.GetTiresWheelsList;
import com.base.api.response.info.common.GetTypesOfPayersForRedelivery;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Common_ServiceTest  {

    Common_Service service = new Common_Service();
    private final String API_KEY = System.getenv("API_KEY");
    public void testGetTimeIntervals() {

    }

    @Test
    public void testGetCargoTypes() throws IOException {
        GetCargoTypes info =  service.getCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetBackwardDeliveryCargoTypes() throws IOException {
        GetCargoTypes info = service.getBackwardDeliveryCargoTypes(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetPalletsList() throws IOException {
        GetPalletsList info = service.getPalletsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetTypesOfPayersForRedelivery() throws IOException {

        GetTypesOfPayersForRedelivery info = service.getTypesOfPayersForRedelivery(API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetPackList() throws IOException {

        GetPalletsList  info = service.getPalletsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetTiresWheelsList() throws IOException {
        GetTiresWheelsList info = service.getTiresWheelsList(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetCargoDescriptionList() throws IOException {
        Pagination pagination = new Pagination();
        pagination.setPage(1);
        pagination.setLimit(100);
        GetCargoDescriptionList info = service.getCargoDescriptionList(null, pagination, API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetMessageCodeText() throws IOException {
        GetMessageCodeText info = service.getMessageCodeText(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetServiceTypes() throws IOException {

        GetServiceTypes info = service.getServiceTypes(API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }
    @Test
    public void testGetOwnershipFormsList() throws IOException {

        GetOwnershipFormsList info = service.getOwnershipFormsList(API_KEY);

        System.out.println(info.getStatusResponse());

        info.getData().forEach(System.out::println);
    }
}