package com.company;

public class MakeCar extends Car {

    private String model;
    private String name;

    public MakeCar(String brand, int year, String color, double price, String model, String name) {
        super(brand, year, color, price);
        this.model = model;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
