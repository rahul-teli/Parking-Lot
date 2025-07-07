package com.parkinglot.models;

import java.time.LocalDate;

public class Invoice {
    int id;
    Ticket ticket;
    int amount;
    Gate gate;
    LocalDate exitTime;
    int operatorId;
}
