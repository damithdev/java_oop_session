package com.swingapp.Intermediates;


import com.swingapp.Intermediates.models.Car;
import com.swingapp.Intermediates.models.Info;

public class Anonymous {
    public static void main(String[] args) {
        Car car1 = new Car() {
            @Override
            public void start() {
                System.out.println("anonymous start");
            }
        };

        Info info = new Info() {
            @Override
            public void displayInfo() {
                System.out.println("anonymous interface info");
            }
        };

        car1.start();
        info.displayInfo();

    }
}
