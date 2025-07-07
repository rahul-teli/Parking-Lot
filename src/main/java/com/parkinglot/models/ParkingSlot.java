package com.parkinglot.models;

import lombok.Data;

@Data
public class ParkingSlot {
    int id;
    int floor;
    Vehicle vehicle;
    SlotState slotState;
    SlotType slotType;
    VehicleType vehicleType;
}
