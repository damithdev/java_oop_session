package com.swingapp.Intermediates.models;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionThrowerTest {
    public void run() throws IOException, ParseException {
        throw new IOException();
//		throw new ParseException("Error in command line", 2);
    }
}
