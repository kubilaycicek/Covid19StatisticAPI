package com.kubilaycicek.corona.response;

import com.kubilaycicek.corona.model.TotalData;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResponse implements Serializable {
    private boolean success;
}
