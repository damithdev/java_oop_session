package com.swingapp.Zoo.Visitors;

import com.swingapp.Zoo.Ticketing.Payment;
import com.swingapp.Zoo.Ticketing.Ticket;
import com.swingapp.Zoo.Util.Logger;

public abstract class Person {

    private String name;
    private double ticketValue;

    public Person(String name,double ticketPrice) {
        this.name = name;
        this.ticketValue = ticketPrice;
        welcome();
    }

    protected abstract double calculateTicketPrice();
    protected abstract Ticket createTicket(Payment payment , String name, double value);

    // This method is protected for giving access within Person class only
    private void welcome() {
        Logger.getInstance().log("Welcome to the zoo, " + getName());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Ticket ticket;


    public Ticket getTicket(Payment payment){
        this.ticket = createTicket(payment,name,calculateTicketPrice());
        return ticket;
    }

    public Boolean isPaid (){
        return ticket != null;
    }

    public double getTicketValue() {
        return ticketValue;
    }

    protected double getCalculatedTicketValue(double discount) {
        return ticketValue - ticketValue *  discount/100 ;

    }

}
