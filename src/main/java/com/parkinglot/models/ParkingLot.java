package com.parkinglot.models;

import lombok.Data;

import java.util.List;
@Data

public class ParkingLot {
    String name;
    String address;
    List<ParkingSlot> parkingSlots;
    List<Gate> entryGates;
    List<Gate> exitGates;

}
