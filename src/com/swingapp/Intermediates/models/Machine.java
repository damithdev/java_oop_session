package com.swingapp.Intermediates.models;

public class Machine implements Info {
    private String name;

    private String type;

    public Machine() {
//		System.out.println("First constructor running!");
//		this("Sewing");
    }

    public Machine(String name) {
        System.out.println("Second constructor running!");
//		this(name, "electric");
    }

    public Machine(String name, String type) {
        System.out.println("Third constructor running!");
        this.setName(name);
        this.setType(type);
        this.displayInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Type: " + this.getType());
    }

    public void start() {
        System.out.println("Machine Started.");
    }

    @Override
    public String toString() {
        return "Machine Object";
    }
}