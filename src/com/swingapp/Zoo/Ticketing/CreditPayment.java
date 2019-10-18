package com.swingapp.Zoo.Ticketing;

import com.swingapp.Zoo.Util.Logger;

public class CreditPayment implements Payment {


    @Override
    public Ticket pay(Ticket ticket) {
        Logger.getInstance().log(ticket.getOwnerName() + " payed " + ticket.getTicketValue() + "For a new Ticket");
        return ticket;
    }
}
