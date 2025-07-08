package com.parkinglot.strategy;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.ParkingSlot;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehicle;

public interface SlotFindingStrategy {

    ParkingSlot findParkingSlot(
            ParkingLot parkingLot, Vehicle vehicle
    );
}
