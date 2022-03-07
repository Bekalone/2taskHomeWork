package com.company;

public class Car implements Printable {
    private String model;
    private int year;
    private double volume;

    public Car(String model, int year, double volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.print("Model: " + model + ", Year: " + year + ", Volume: " + volume + ",");
    }
}
