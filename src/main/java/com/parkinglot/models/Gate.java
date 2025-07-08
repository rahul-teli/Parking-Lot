package com.parkinglot.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Gate {
    int id;
    int  operatorId;
    GateType gateType;
    ParkingLot parkingLot;
}
