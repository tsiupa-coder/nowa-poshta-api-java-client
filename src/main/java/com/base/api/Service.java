package com.base.api;

import com.base.api.request.MethodProperties;
import com.base.api.request.Pagination;
import com.base.api.request.Request;
import com.base.api.response.adresses.CreateAddress;
import com.base.api.response.adresses.GetAddresses;
import com.base.api.response.adresses.SimpleAddress;
import com.base.api.response.city.GetCity;

import java.io.IOException;

public class Service {

    private HTTP_Service http_helper;

    public Service() {
        http_helper = new HTTP_Service();
    }

    private static final String URL = "https://api.novaposhta.ua/v2.0/json/";

    public GetCity getCity(String city, Pagination pagination, String api_key) throws IOException {

        Request request = new Request();
        request.setApiKey(api_key);
        request.setModelName("Address");
        request.setCalledMethod("searchSettlements");
        MethodProperties methodProperties = new MethodProperties();
        methodProperties.setCityName(city);
        methodProperties.setLimit(pagination.getLimit());
        methodProperties.setPage(pagination.getPage());
        request.setMethodProperties(methodProperties);

        return http_helper
                .postRequest(URL, request)
                .getResponse(new GetCity());
    }

    public GetAddresses getAddresses(String streetName, String settlementRef, Pagination pagination, String api_key) throws IOException {

        Request request = new Request();
        request.setApiKey(api_key);
        request.setModelName("Address");
        request.setCalledMethod("searchSettlementStreets");

        MethodProperties methodProperties = new MethodProperties();
        methodProperties.setStreetName(streetName);
        methodProperties.setSettlementRef(settlementRef);
        methodProperties.setLimit(pagination.getLimit());
        methodProperties.setPage(pagination.getPage());
        request.setMethodProperties(methodProperties);


        return http_helper
                .postRequest(URL, request)
                .getResponse(new GetAddresses());
    }


    public CreateAddress createAddress(SimpleAddress address, String api_key) throws IOException {

        Request request = new Request();
        request.setApiKey(api_key);
        request.setModelName("Address");
        request.setCalledMethod("save");

        MethodProperties methodProperties = new MethodProperties();
        methodProperties.setCounterpartyRef(address.getCounterpartyRef());
        methodProperties.setStreetRef(address.getStreetRef());
        methodProperties.setBuildingNumber(address.getBuildingNumber());
        methodProperties.setFlat(address.getFlat());
        methodProperties.setNote(address.getNote());

        request.setMethodProperties(methodProperties);

        return http_helper
                .postRequest(URL, request)
                .getResponse(new CreateAddress());
    }


}
