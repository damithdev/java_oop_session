package com.swingapp.Intermediates;

import com.swingapp.Intermediates.models.ExceptionThrowerTest;

import java.io.IOException;
import java.text.ParseException;

public class Exceptions {
    public static void main(String[] args) {
        ExceptionThrowerTest testing = new ExceptionThrowerTest();

        try {
            testing.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }


}


