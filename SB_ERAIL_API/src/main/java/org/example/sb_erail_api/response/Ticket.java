package org.example.sb_erail_api.response;

import lombok.Data;

@Data
public class Ticket {
    private Integer ticketId;
    private String from;
    private String to;
    private String ticketNumber;
    private String tickCost;
    private String ticketStatus;
    private String trainNumber;
}
