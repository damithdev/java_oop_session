package com.swingapp.Zoo;

import com.swingapp.Zoo.Ticketing.*;
import com.swingapp.Zoo.Ticketing.CashPayment;
import com.swingapp.Zoo.Visitors.Adult;
import com.swingapp.Zoo.Visitors.Child;
import com.swingapp.Zoo.Visitors.Person;

public class Demo {

    public static void main(String[] args) {


        Person kamal = new Child("kamal",5);
        Ticket ticketkamal = kamal.getTicket(new CashPayment());



        Person ruwan = new Adult("ruwan");
        Ticket ticketruwan = ruwan.getTicket(new CreditPayment());

    }
}
