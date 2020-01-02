package com.dktechin.ticket.sales.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Ticket {
    private final Long fee;

    /**
     * 공연을 관람하기 원햐는 모든 사굄들은 티켓을 소지해야한다.
     * @param fee 공연가격
     */
    public Ticket(Long fee) {
        this.fee = fee;
    }
}
