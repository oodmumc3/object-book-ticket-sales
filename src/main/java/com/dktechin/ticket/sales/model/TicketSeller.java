package com.dktechin.ticket.sales.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 티켓 판매원 도메인 오브젝트
 */
@AllArgsConstructor
@ToString
public class TicketSeller {
    /** * 자신이 일하는 매표소 */
    @Getter private final TicketOffice ticketOffice;
}
