package com.kubilaycicek.corona.constants;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Arrays;

public class Constants {

    public static final String API_KEY = "your_api_key";
    public static final String COVID_API_BASE_URL = "https://api.collectapi.com/corona/";
    public static final String TOTAL_DATA_URL = COVID_API_BASE_URL + "totalData";
    public static final String COUNTRY_DATA_URL = COVID_API_BASE_URL + "countriesData";
    public static final String CORONA_NEWS_DATA_URL = COVID_API_BASE_URL + "coronaNews";
    public static final String CONTINENT_DATA_URL = COVID_API_BASE_URL + "continentData";


}
