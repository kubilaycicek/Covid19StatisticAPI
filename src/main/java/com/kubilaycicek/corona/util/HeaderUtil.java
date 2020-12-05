package com.kubilaycicek.corona.util;

import com.kubilaycicek.corona.constants.Constants;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class HeaderUtil {
    public static HttpEntity getHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("authorization", Constants.API_KEY);
        HttpEntity<String> entity = new HttpEntity<>("body", headers);
        return entity;
    }
}
