package com.parkinglot.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Ticket {
    int id;
    ParkingSlot parkingSlot;
    LocalDate entryTime;
    int operatorId;
    Gate gate;
}
