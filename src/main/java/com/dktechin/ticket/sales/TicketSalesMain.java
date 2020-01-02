package com.dktechin.ticket.sales;

import com.dktechin.ticket.sales.model.Audience;
import com.dktechin.ticket.sales.model.Bag;
import com.dktechin.ticket.sales.model.Invitation;
import com.dktechin.ticket.sales.model.Theater;
import com.dktechin.ticket.sales.model.Ticket;
import com.dktechin.ticket.sales.model.TicketOffice;
import com.dktechin.ticket.sales.model.TicketSeller;
import java.time.LocalDateTime;

public class TicketSalesMain {
    public static void main(String[] args) {
        Ticket ticket_1 = new Ticket(100L);
        Ticket ticket_2 = new Ticket(100L);
        TicketOffice ticketOffice = new TicketOffice(0L, ticket_1, ticket_2);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);

        Bag hasInvitationBag = new Bag(new Invitation(LocalDateTime.now()), 0L);
        Audience hasInvitationAudience = new Audience(hasInvitationBag);
        Theater theater = new Theater(ticketSeller);
        theater.enter(hasInvitationAudience);
        System.out.println("hasInvitationAudience :: " + theater);

        Bag dontHaveInvitationBag = new Bag(100L);
        Audience dontHaveInvitationAudience = new Audience(dontHaveInvitationBag);
        theater.enter(dontHaveInvitationAudience);
        System.out.println("dontHaveInvitationAudience :: " + theater);
    }
}
