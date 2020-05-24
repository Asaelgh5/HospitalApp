package com.google.firebase.example.fireeats.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class BedLog {
    private String bedId;
    private @ServerTimestamp Date occupancyDate;

    public BedLog() { }

    public BedLog(String bedId, Date occupancyDate) {
        this.bedId = bedId;
        this.occupancyDate = occupancyDate;
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public Date getOccupancyDate() {
        return occupancyDate;
    }

    public void setOccupancyDate(Date occupancyDate) {
        this.occupancyDate = occupancyDate;
    }
}
