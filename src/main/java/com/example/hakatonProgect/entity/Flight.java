package com.example.hakatonProgect.entity;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class Flight {
    private int flightNumberPnr;
    private Timestamp departureDatePnr;
    private String departurePnr;
    private String arrivalPnr;
    private String terminalPnr;
    private Timestamp departureTimePnr;
    private Timestamp arrivalTimePnr;

    //поля которые не видет user
    private Timestamp dayOfDeparturePnr;
    private String planeTypePnr;
    private String eTicketPnr;
    private String companies;
}
