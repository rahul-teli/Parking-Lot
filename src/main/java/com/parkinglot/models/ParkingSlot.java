package com.parkinglot.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingSlot {
    int id;
    int floor;
    Vehicle vehicle;
    SlotState slotState;
    SlotType slotType;
    VehicleType vehicleType;
}
