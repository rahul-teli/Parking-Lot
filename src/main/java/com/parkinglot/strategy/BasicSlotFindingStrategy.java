package com.parkinglot.strategy;

import com.parkinglot.models.*;

import java.util.List;

public class BasicSlotFindingStrategy implements SlotFindingStrategy {

    @Override
    public ParkingSlot findParkingSlot(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingSlot> parkingSlotList = parkingLot.getParkingSlots();
        for (ParkingSlot parkingSlot : parkingSlotList) {
            if (parkingSlot.getSlotState().equals(SlotState.FREE) && parkingSlot.getVehicleType().equals(vehicle.getVehicleType())) {
                parkingSlot.setVehicle(vehicle);
                parkingSlot.setSlotState(SlotState.OCCUPIED);
                return parkingSlot;
            }

        }
        return null; // No free slot found for the vehicle
    }
}
