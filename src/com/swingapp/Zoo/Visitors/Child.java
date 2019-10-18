package com.swingapp.Zoo.Visitors;

import com.swingapp.Zoo.Ticketing.ChildTicket;
import com.swingapp.Zoo.Ticketing.Payment;
import com.swingapp.Zoo.Ticketing.Ticket;

public class Child extends Person {

    private int discount;
    public Child(String name, int discount) {
        super(name , 50);
        this.discount = discount;
    }

    public Child(String name) {
        super(name , 50);
        this.discount = 0;
    }


    @Override
    public double calculateTicketPrice() {
        return super.getCalculatedTicketValue(discount);

    }

    @Override
    public Ticket createTicket(Payment payment , String name, double value) {
        return payment.pay(new ChildTicket(name, value));
    }
}
