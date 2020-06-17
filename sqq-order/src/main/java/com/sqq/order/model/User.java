package com.sqq.order.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;

    private Integer age;

    private Double balance;

    private Integer integral;

    private Date careateTime;

}