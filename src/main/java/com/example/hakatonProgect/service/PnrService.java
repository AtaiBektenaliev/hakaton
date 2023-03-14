package com.example.hakatonProgect.service;

import com.example.hakatonProgect.entity.Pnr;

public class PnrService {
    public Pnr decodingPnr(Pnr pnr){
        String pnr1 = "TS275J15OCT4LGWYVRHK110101200332E0";
        pnr.setFlightNumberPnr(pnr1.substring(0, 5));
        pnr.setDepartureDatePnr(pnr1.substring(6, 11));
        pnr.setDeparturePnr(pnr1.substring(12, 18));
        pnr.setArrivalPnr(pnr1.substring(12, 18));
        pnr.setTerminalPnr(pnr1.substring(18, 21));
        pnr.setDepartureTimePnr(pnr1.substring(21, 25));
        pnr.setArrivalTimePnr(pnr1.substring(25, 29));
        pnr.setDayOfDeparturePnr(pnr1.substring(11, 12));
        pnr.setPlaneTypePnr(pnr1.substring(29, 32));
        pnr.setETicketPnr(pnr1.substring(32, 33));
        return pnr;
    }
}
