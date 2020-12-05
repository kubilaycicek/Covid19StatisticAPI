package com.kubilaycicek.corona.response;

import com.kubilaycicek.corona.model.ContinentData;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ContinentDataResponse extends BaseResponse {
    List<ContinentData> result;
}
