package com.base.api.mainservice;

import com.base.api.response.info.additionalservice.CheckPossibilityCreateReturn;
import com.base.api.response.info.additionalservice.GetReturnReasons;
import com.base.api.response.info.additionalservice.GetReturnReasonsSubtypes;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalServiceTest {

    AdditionalService service = new AdditionalService();
    private final String API_KEY = "64db4746458023076ed38c878a0b398f";
    @Test
    void checkPossibilityCreateReturn() throws IOException {
        CheckPossibilityCreateReturn info = service.checkPossibilityCreateReturn("1", API_KEY);

        info.getStatusResponse();
        info.getData().forEach(System.out::println);
    }

    @Test
    void getReturnReasons() throws IOException {

        GetReturnReasons info = service.getReturnReasons(API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    @Test
    void getReturnReasonsSubtypes() throws IOException {
        GetReturnReasonsSubtypes info = service.getReturnReasonsSubtypes("49754eb2-a9e1-11e3-9fa0-0050568002cf", API_KEY);

        System.out.println(info.getStatusResponse());
        info.getData().forEach(System.out::println);
    }

    @Test
    void getReturnOrdersList() {
    }

    @Test
    void deleteAdditionalService() {
    }

    @Test
    void checkPossibilityChangeEW() {
    }

    @Test
    void getChangeEWOrdersList() {
    }

    @Test
    void checkPossibilityForRedirecting() {
    }

    @Test
    void getRedirectionOrdersList() {
    }
}