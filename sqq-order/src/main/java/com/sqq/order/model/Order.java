package com.sqq.order.model;

import java.util.Date;

public class Order {
    private Integer id;

    private String orderNo;

    private Double price;

    private Integer userId;

    private Date createTime;

    public Order(Integer id, String orderNo, Double price, Integer userId, Date createTime) {
        this.id = id;
        this.orderNo = orderNo;
        this.price = price;
        this.userId = userId;
        this.createTime = createTime;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}