package com.kubilaycicek.corona.service;

import com.kubilaycicek.corona.constants.Constants;
import com.kubilaycicek.corona.response.ContinentDataResponse;
import com.kubilaycicek.corona.response.CoronaNewsResponse;
import com.kubilaycicek.corona.response.CountryDataResponse;
import com.kubilaycicek.corona.response.TotalDataResponse;

import com.kubilaycicek.corona.util.HeaderUtil;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpUtils;

@Service
@RequiredArgsConstructor
public class CovidApiServiceImpl implements CovidApiService {

    private final RestTemplate restTemplate;

    @Override
    public TotalDataResponse getTotalData() {
        return restTemplate.exchange(Constants.TOTAL_DATA_URL,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), TotalDataResponse.class).getBody();
    }

    @Override
    public CountryDataResponse getCountryData() {
        return restTemplate.exchange(Constants.COUNTRY_DATA_URL,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), CountryDataResponse.class).getBody();
    }

    @Override
    public ContinentDataResponse getContinentData() {
        return restTemplate.exchange(Constants.CONTINENT_DATA_URL,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), ContinentDataResponse.class).getBody();
    }

    @Override
    public CoronaNewsResponse getCoronaNews() {
        return restTemplate.exchange(Constants.CORONA_NEWS_DATA_URL,
                HttpMethod.GET, HeaderUtil.getHttpEntity(), CoronaNewsResponse.class).getBody();
    }
}
