package com.kubilaycicek.corona.controller;

import com.kubilaycicek.corona.response.ContinentDataResponse;
import com.kubilaycicek.corona.response.CoronaNewsResponse;
import com.kubilaycicek.corona.response.CountryDataResponse;
import com.kubilaycicek.corona.response.TotalDataResponse;
import com.kubilaycicek.corona.service.CovidApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CovidController {

    @Autowired
    CovidApiService covidApiService;

    @GetMapping("/coronaNews")
    public CoronaNewsResponse getCoronaNewsList(){
        return covidApiService.getCoronaNews();
    }

    @GetMapping("/countriesData")
    public CountryDataResponse getCountriesData(){
        return covidApiService.getCountryData();
    }

    @GetMapping("/continentData")
    public ContinentDataResponse getContinentData(){
        return covidApiService.getContinentData();
    }

    @GetMapping("/totalData")
    public TotalDataResponse getTotalData(){
        return covidApiService.getTotalData();
    }
}
