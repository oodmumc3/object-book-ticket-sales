package com.dktechin.ticket.sales.model;

import lombok.Setter;

/**
 * 관람객의 가방을 나타내는 도메인 오브젝트
 */
public class Bag {

    /** * 보유 금액 */
    private Long amount = 0L;
    /** * 초대권 */
    private Invitation invitation;
    /** * 관람 티켓 */
    @Setter private Ticket ticket;

    /**
     * 초대권이 있는경우
     * @param invitation 초대장
     * @param amount 보유금액
     */
    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    /**
     * 초대권이 없고 돈만 있는경우
     * @param amount 보유금액
     */
    public Bag(Long amount) {
        this(null, amount);
    }

    /**
     * 초대장의 보유 여부를 판단한다.
     * @return 초대장 보유여부
     */
    public boolean hasInvitation() {
        return invitation != null;
    }

    /**
     * 티켓의 소유 여부를 판단한다.
     * @return 티켓의 소유 여부
     */
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
