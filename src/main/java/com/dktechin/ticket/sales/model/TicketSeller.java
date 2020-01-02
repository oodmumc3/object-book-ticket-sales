package com.dktechin.ticket.sales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TicketSeller {
    @Getter private final TicketOffice ticketOffice;
}
