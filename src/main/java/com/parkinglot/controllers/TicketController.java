package com.parkinglot.controllers;

import com.parkinglot.dtos.CreateTicket;
import com.parkinglot.dtos.UserTicket;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.Vehicle;
import com.parkinglot.services.TicketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    @PostMapping(value = "/ticket")
    public @ResponseBody UserTicket createTicket(@RequestBody CreateTicket createTicket) {
        System.out.println("Create ticket endpoint called.");

        Vehicle vehicle = new Vehicle(createTicket.getVehicleRegNo(), createTicket.getVehicleType());

        Ticket ticket = ticketService.createTicket(vehicle, createTicket.getGateId());


        // save to ticket repository
        // ticketRepository.save(Ticket)

        return getUserTicket(ticket);
    }

    private static UserTicket getUserTicket(Ticket ticket) {
        return UserTicket.builder()
                .ticketId(ticket.getId())
                .floorNumber(ticket.getParkingSlot().getFloor())
                .slotId(ticket.getParkingSlot().getId())
                .time(ticket.getEntryTime())
                .build();
    }

}