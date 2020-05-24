package com.google.firebase.example.fireeats.model;

import com.google.firebase.auth.FirebaseUser;

public class Hospital {
    private String userId, phone, name, address, scaleType;

    public Hospital(){
    }

    public Hospital(FirebaseUser user, String name, String phone, String address, String scaleType) {
        this.userId = user.getUid();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.scaleType = scaleType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScaleType() {
        return scaleType;
    }

    public void setScaleType(String scaleType) {
        this.scaleType = scaleType;
    }
}
