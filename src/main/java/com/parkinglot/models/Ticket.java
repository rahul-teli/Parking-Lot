package com.parkinglot.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Ticket {
    long id;
    ParkingSlot parkingSlot;
    LocalDate entryTime;
    Vehicle vehicle;
    int operatorId;
    Gate gate;
}
