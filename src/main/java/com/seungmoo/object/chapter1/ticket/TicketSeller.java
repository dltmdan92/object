package com.seungmoo.object.chapter1.ticket;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        /*
        TicketOffice는 왜 캡슐화를 안했을 까?
        - ticketOffice를 캡슐화하게 되면 Audience라는 의존성이 TicketOffice에 추가된다.
        - 자율화/캡슐화 vs 의존성 추가  -> trade-off를 고려할 것
         */
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
    }
}
