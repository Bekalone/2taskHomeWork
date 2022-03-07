package com.company;

public class Chair extends Car {
    private String material;
    private int height;

    public Chair(String model, int year, double volume, String material, int height) {
        super(model, year, volume);
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Material: " + material + ", Height: " + height);
    }
}
