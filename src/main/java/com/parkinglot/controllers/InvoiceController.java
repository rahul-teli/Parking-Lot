package com.parkinglot.controllers;


import com.parkinglot.dtos.UserTicket;
import com.parkinglot.models.Invoice;
import com.parkinglot.services.InvoiceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

    // TODO: Change Invoice to DTO object

    private final com.parkinglot.services.InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/invoice")
    public Invoice generateInvoice(UserTicket userTicket) {
        return invoiceService.generateInvoice(userTicket.getTicketId(), 1L);
    }
}
