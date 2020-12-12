package com.kubilaycicek.corona.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TotalData extends BaseData {
    private String totalDeaths;
    private String totalCases;
    private String totalRecovered;
}
