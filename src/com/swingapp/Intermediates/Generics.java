package com.swingapp.Intermediates;

import com.swingapp.Intermediates.models.Machine;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        // modern style
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
        String  animal = strings.get(1);

        System.out.println(animal);

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        ArrayList<Machine> machineList = new ArrayList<Machine>();
    }
}
