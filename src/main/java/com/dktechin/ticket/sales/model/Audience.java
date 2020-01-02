package com.dktechin.ticket.sales.model;

import lombok.RequiredArgsConstructor;

/**
 * 관람객 도메인 클래스
 * 소지품을 보호하기 위해 가빙올 소지한다.
 */
@RequiredArgsConstructor
public class Audience {
    private final Bag bag;

    public Long buy(Ticket ticket) {
        if (this.bag.hasInvitation()) {
            this.bag.setTicket(ticket);
            return 0L;
        } else {
            this.bag.minusAmount(ticket.getFee());
            this.bag.setTicket(ticket);
            return ticket.getFee();
        }
    }
}
