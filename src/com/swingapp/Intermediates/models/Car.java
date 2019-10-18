package com.swingapp.Intermediates.models;

public class Car extends Machine {
    public void toot() {
        System.out.println("Tin tin tin...");
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }


    @Override
    public String toString() {
        return "Car Object";
    }
}
