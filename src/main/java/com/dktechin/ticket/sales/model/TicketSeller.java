package com.dktechin.ticket.sales.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * 티켓 판매원 도메인 오브젝트
 */
@AllArgsConstructor
@ToString
public class TicketSeller {
    /** * 자신이 일하는 매표소 */
    private final TicketOffice ticketOffice;

    /**
     * 티켓 판매원이 관람객에게 티켓을 판매한다.
     * @param audience 관람객 정보
     */
    public void sellTo(Audience audience) {
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
