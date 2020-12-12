package com.kubilaycicek.corona.controller;

import com.kubilaycicek.corona.response.ContinentDataResponse;
import com.kubilaycicek.corona.response.CoronaNewsResponse;
import com.kubilaycicek.corona.response.CountryDataResponse;
import com.kubilaycicek.corona.response.TotalDataResponse;
import com.kubilaycicek.corona.service.CovidApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {

    @Autowired
    CovidApiService covidApiService;

    @Cacheable(cacheNames = "coronaNews")
    @GetMapping("/coronaNews")
    public CoronaNewsResponse getCoronaNewsList(){
        return covidApiService.getCoronaNews();
    }

    @Cacheable(cacheNames = "countriesData")
    @GetMapping("/countriesData")
    public CountryDataResponse getCountriesData(){
        return covidApiService.getCountryData();
    }

    @Cacheable(cacheNames = "continentData")
    @GetMapping("/continentData")
    public ContinentDataResponse getContinentData(){
        return covidApiService.getContinentData();
    }

    @Cacheable(cacheNames = "totalData")
    @GetMapping("/totalData")
    public TotalDataResponse getTotalData(){
        return covidApiService.getTotalData();
    }
}
