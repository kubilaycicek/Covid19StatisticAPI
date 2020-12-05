package com.kubilaycicek.corona.service;

import com.kubilaycicek.corona.response.ContinentDataResponse;
import com.kubilaycicek.corona.response.CoronaNewsResponse;
import com.kubilaycicek.corona.response.CountryDataResponse;
import com.kubilaycicek.corona.response.TotalDataResponse;

public interface CovidApiService {
    TotalDataResponse getTotalData();
    CountryDataResponse getCountryData();
    ContinentDataResponse getContinentData();
    CoronaNewsResponse getCoronaNews();
}
