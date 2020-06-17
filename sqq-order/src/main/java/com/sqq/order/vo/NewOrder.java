package com.sqq.order.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class NewOrder implements Serializable {

    private Integer userId;

    private Double price;
}
