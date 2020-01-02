package com.dktechin.ticket.sales.model;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 극장 도메인 오브젝트
 */
@RequiredArgsConstructor
@ToString
public class Theater {

    /**
     * 티켓 판매원 정보
     */
    private final TicketSeller ticketSeller;

    /**
     * 관람객 극장 입장
     * @param audience 관람객 정보
     */
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            System.out.println("audience have an invitation!!");
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            System.out.println("audience don`t have an invitation!!");
            Ticket ticket = this.ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
