package com.sqq.activity.model;

import java.util.Date;

public class Activity {
    private Integer id;

    private String actName;

    private Double price;

    private Integer status;

    private Date createTime;

    public Activity(Integer id, String actName, Double price, Integer status, Date createTime) {
        this.id = id;
        this.actName = actName;
        this.price = price;
        this.status = status;
        this.createTime = createTime;
    }

    public Activity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}