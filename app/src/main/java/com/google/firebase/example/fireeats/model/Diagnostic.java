package com.google.firebase.example.fireeats.model;

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class Diagnostic {
    private String description;
    private @ServerTimestamp Date creationDate;
}
