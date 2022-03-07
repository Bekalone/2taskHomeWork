package com.company;

public class CarBody extends Car{
    private BodyMaterial material;

    public CarBody(String model, int year, double volume, BodyMaterial material) {
        super(model, year, volume);
        this.material = material;
    }

    public BodyMaterial getMaterial() {
        return material;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Material: " + material);
    }
}
