package com.base.api;

import com.base.api.request.MethodProperties;
import com.base.api.request.Pagination;
import com.base.api.request.Request;
import com.base.api.response.adresses.CreateAddress;
import com.base.api.response.adresses.DeleteAddress;
import com.base.api.response.adresses.GetAddresses;
import com.base.api.model.address.SimpleAddress;
import com.base.api.response.city.GetCity;
import com.google.gson.JsonObject;

import java.io.IOException;

public class Service {

    private HTTP_Service http_helper;

    public Service() {
        http_helper = new HTTP_Service();
    }

    private static final String URL = "https://api.novaposhta.ua/v2.0/json/";


    /**
     *  returns cities by given parameters
     *
     * @param  city - city's name
     * @param pagination - contains page and limit, if u understand me :)
     * @param api_key - takes from nowa-poshta app
     * @return - GetCity, represents endpoint response
     * @throws IOException
     */
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

    /**
     *
     * @param streetName - street's name, which u want find
     * @param settlementRef - it's reference, where is that street
     * @param pagination - contains page and limit, if u understand me :)
     * @param api_key -  takes from nowa-poshta app
     * @return - GetAddresses, represents api response
     * @throws IOException
     */
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

    // TODO: 07.05.22 Need testing
    /**
     *
     * @param address - object represents address
     * @param api_key - takes from nowa-poshta app
     * @return
     * @throws IOException
     */
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


    public DeleteAddress deleteAddress(String address_ref, String api_key) throws IOException {

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiKey", api_key);
        jsonObject.addProperty("modelName", "Address");
        jsonObject.addProperty("calledMethod", "delete");

        JsonObject jsonObjectIn = new JsonObject();
        jsonObjectIn.addProperty("Ref", address_ref);

        jsonObject.add("methodProperties", jsonObjectIn);

        return http_helper.postRequest(URL, jsonObject).getResponse(new DeleteAddress());
    }


}
