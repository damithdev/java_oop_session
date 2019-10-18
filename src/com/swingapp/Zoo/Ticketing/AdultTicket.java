package com.swingapp.Zoo.Ticketing;

import com.swingapp.Zoo.Util.Logger;

import java.util.Random;

public class AdultTicket implements Ticket {

    private String owner;
    private double value;
    private int id;

    AdultTicket(String owner,double value){
        this.owner = owner;
        this.value = value;
        id = new Random().nextInt(999999);

        Logger.getInstance().log(owner + "purchased ticket " + id + " value :" +value );
    }


    @Override
    public double getTicketId() {
        return id;
    }

    @Override
    public String getOwnerName() {
        return owner;
    }

    @Override
    public double getTicketValue() {
        return value;
    }
}
