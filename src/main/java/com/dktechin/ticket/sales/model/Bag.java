package com.dktechin.ticket.sales.model;

import lombok.Setter;

public class Bag {
    private Long amount = 0L;
    private Invitation invitation;
    @Setter private Ticket ticket;

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Bag(Long amount) {
        this(null, amount);
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
