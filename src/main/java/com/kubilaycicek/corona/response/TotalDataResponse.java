package com.kubilaycicek.corona.response;

import com.kubilaycicek.corona.model.TotalData;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TotalDataResponse extends BaseResponse {
    TotalData result;
}
