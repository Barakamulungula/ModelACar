package com.company;

public class Bmw extends Car{

    private String color;

    public Bmw(int year, String make, String model, double price, int speed, int gas, String color) {
        super(year, make, model, price, speed, gas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void getBmwInfo(){
        System.out.println("The current car is a "+ getYear()+ " "+ getMake() + " " + getModel()+". It's going "+getSpeed()+" MPH and has "+getGas()+"% gas left");
    }



}
