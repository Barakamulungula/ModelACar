package com.company;

public class Bmw extends Car {

    private String model;

    public Bmw(String brand, int year, String color, double price, String model) {
        super(brand, year, color, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
