package com.kubilaycicek.corona.response;

import com.kubilaycicek.corona.model.CoronaNewsData;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class CoronaNewsResponse extends BaseResponse {
    List<CoronaNewsData> result;
}
