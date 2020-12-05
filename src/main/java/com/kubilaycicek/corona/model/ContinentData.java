package com.kubilaycicek.corona.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ContinentData {
    private String continent;
    private String totalCases;
    private String newCases;
    private String totalDeaths;
    private String newDeaths;
    private String totalRecovered;
    private String activeCases;
}
