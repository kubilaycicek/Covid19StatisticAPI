package com.kubilaycicek.corona.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CountryData {
    String country;
    String totalCases;
    String newCases;
    String totalDeaths;
    String newDeaths;
    String totalRecovered;
    String activeCases;
}
