package com.kubilaycicek.corona.response;

import com.kubilaycicek.corona.model.CountryData;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class CountryDataResponse extends BaseResponse {
    List<CountryData> result;
}
