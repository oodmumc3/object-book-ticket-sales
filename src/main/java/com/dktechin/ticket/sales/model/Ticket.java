package com.dktechin.ticket.sales.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Ticket {
    private final Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }
}
