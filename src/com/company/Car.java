package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car {
    private Scanner input = new Scanner(System.in);
    private String make;
    private int year;
    private String color;
    private double price;
    private boolean automatic;
    private String model;
    private int speed = 0;
    private int gas = 100;

    public Car() {
        setMake();
        setModel();
        setSpeed(0);
        setGas(100);
    }

    public String getMake() {
        return make;
    }

    public void setMake() {
        System.out.println("What is the make of the car you would like make?");
        try{
            make = input.nextLine();
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter the name of the make");
            setMake();
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        System.out.println("What is the year of the car you would like make?");
        try{
            year = input.nextInt();
        }catch (InputMismatchException ime){
            input.nextInt();
            System.out.println("Please enter a number for the year");
            setYear();
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        System.out.println("What is the model of the car you would like make?");
        try{
            model = input.nextLine();
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter the name of the model");
            setModel();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo() {
        System.out.println("The current car is a "+ getMake() + " " + getModel()+". It's going "+getSpeed()+" MPH and has "+getGas()+"% gas left");
    }

    public void driveCar(Car car){
        for(int seconds = 0; seconds <= 5; seconds++){
            //Get current gas
            //Get current speed

            car.setSpeed(car.getSpeed()+1);
            car.setGas(car.getGas()-1);

            System.out.println("The "+ car.getMake()+ " "+car.getModel()+ " is going "+ car.getSpeed()+ " MPH"+ " it has "+ car.getGas()+ "% of its gas left");
        }

        mainMenu.menu(car);

    }

    public void stopCar(Car car){
        for (int seconds = 5; seconds >= 0; seconds--){
            car.setSpeed(car.getSpeed()-1);
            car.setGas(car.getGas()-1);

            System.out.println("The "+ car.getMake()+ " "+car.getModel()+ " is going "+ car.getSpeed()+ " MPH"+ " it has "+ car.getGas()+ "% of its gas left");
        }
    }
}
