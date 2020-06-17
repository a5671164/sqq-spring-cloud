package com.sqq.user.model;

import java.util.Date;

public class User {
    private Integer id;

    private String userName;

    private Integer age;

    private Double balance;

    private Integer integral;

    private Date careateTime;

    public User(Integer id, String userName, Integer age, Double balance, Integer integral, Date careateTime) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.balance = balance;
        this.integral = integral;
        this.careateTime = careateTime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Date getCareateTime() {
        return careateTime;
    }

    public void setCareateTime(Date careateTime) {
        this.careateTime = careateTime;
    }
}