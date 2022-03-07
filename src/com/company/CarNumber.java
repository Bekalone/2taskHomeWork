package com.company;

public class CarNumber extends Car{
    private String country;
    private int registration_region_code;
    private char series;
    private int registration_number;

    public CarNumber(String model, int year, double volume, String country, int registration_region_code, char series, int registration_number) {
        super(model, year, volume);
        this.country = country;
        this.registration_region_code = registration_region_code;
        this.series = series;
        this.registration_number = registration_number;
    }

    public String getCountry() {
        return country;
    }

    public int getRegistration_region_code() {
        return registration_region_code;
    }

    public char getSeries() {
        return series;
    }

    public int getRegistration_number() {
        return registration_number;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" Car number [" +country + ", " + registration_region_code + ", " + series + ", " + registration_number + "] ");
    }
}
