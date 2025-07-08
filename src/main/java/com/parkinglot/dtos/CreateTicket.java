package com.parkinglot.dtos;

import com.parkinglot.models.SlotType;
import com.parkinglot.models.VehicleType;
import lombok.Data;

@Data
public class CreateTicket {
    String vehicleRegNo;
    VehicleType vehicleType;
    long gateId;
    SlotType slotType;
}
