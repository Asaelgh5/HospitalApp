package com.google.firebase.example.fireeats.model;

public class Bed {
    private int bedNumber;
    private int wardNumber;
    private Boolean available;
    private String bedType;

    public Bed() { }

    public Bed(int bedNumber, int wardNumber, Boolean available, String bedType) {
        this.bedNumber = bedNumber;
        this.wardNumber = wardNumber;
        this.available = available;
        this.bedType = bedType;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public int getWardNumber() {
        return wardNumber;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }
}
