package com.kubilaycicek.corona.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CoronaNewsData  extends BaseData {
    String key;
    String url;
    String description;
    String image;
    String name;
    String source;
}
