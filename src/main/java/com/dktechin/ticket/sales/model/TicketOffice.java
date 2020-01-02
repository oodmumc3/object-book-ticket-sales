package com.dktechin.ticket.sales.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.ToString;

/**
 * 매표소 도메인 오브젝트
 */
@ToString
public class TicketOffice {
    /** * 총 판매금액 */
    private Long amount;
    /** * 보유 티켓 목록 */
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return this.tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
