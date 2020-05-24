package com.google.firebase.example.fireeats.model;

import java.util.Date;

public class Patient {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String height;
    private String weight;
    private String phone;
    private String bedId;
    private Date dateOfAdmission;
    private Boolean comorbidity;
    private Boolean terminalState;

    public Patient() { }

    public Patient(String firstName, String middleName, String lastName, Date dateOfBirth, String height, String weight, String phone, String bedId, String symptoms, Date dateOfAdmission, Boolean comorbidity, Boolean terminalState) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
        this.phone = phone;
        this.bedId = bedId;
        this.dateOfAdmission = dateOfAdmission;
        this.comorbidity = comorbidity;
        this.terminalState = terminalState;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public Boolean getComorbidity() {
        return comorbidity;
    }

    public void setComorbidity(Boolean comorbidity) {
        this.comorbidity = comorbidity;
    }

    public Boolean getTerminalState() {
        return terminalState;
    }

    public void setTerminalState(Boolean terminalState) {
        this.terminalState = terminalState;
    }
}
