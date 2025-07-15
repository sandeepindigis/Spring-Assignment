package org.example.sb_erail_api.controller;

import org.example.sb_erail_api.request.Passenger;
import org.example.sb_erail_api.response.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class ERailController {

    Map<Integer, Ticket> tickets = new HashMap<Integer, Ticket>();

    @PostMapping(value = "/bookTicket",
            consumes = {"application/xml", "application/json"},
            produces = {"application/xml", "application/json"})
    public Ticket bookTicket(@RequestBody Passenger passenger) {
        Ticket ticket = new Ticket();

        Random r = new Random();
        int ticketId = r.nextInt();

        ticket.setTicketId(ticketId);
        ticket.setTicketNumber("12312312");
        ticket.setFrom(passenger.getFrom());
        ticket.setTo(passenger.getTo());
        ticket.setTickCost("1150.00 INR");
        ticket.setTicketStatus("Confirmed");
        ticket.setTrainNumber(passenger.getTrainNumber());

        tickets.put(ticketId, ticket);
        return ticket;

    }

    @GetMapping(value = "/ticket/{ticketId}",
            consumes = {"application/xml", "application/json"},
            produces = {"application/xml", "application/json"})
    public Ticket getTicket(@PathVariable int ticketId) {

        if (tickets.containsKey(ticketId)) {
            return tickets.get(ticketId);
        }
        return null;
    }
}
