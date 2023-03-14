package com.example.hakatonProgect.entity;

import lombok.Data;

@Data
public class Pnr {
    private String flightNumberPnr;
    private String departureDatePnr;
    private String departurePnr;
    private String arrivalPnr;
    private String terminalPnr;
    private String departureTimePnr;
    private String arrivalTimePnr;
    private String companiesPnr;

    //поля которые не видет user
    private String dayOfDeparturePnr;
    private String planeTypePnr;
    private String eTicketPnr;

}
