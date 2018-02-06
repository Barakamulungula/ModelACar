package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle{
    private Scanner input = new Scanner(System.in);
    private double price;
    private int speed = 0;
    private int gas = 100;

    public Car() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }

    public Car(int year, String make, String model, double price, int speed, int gas) {
        super(year, make, model);
        this.price = price;
        this.speed = speed;
        this.gas = gas;
    }

    public void setMake() {
        System.out.println("What is the make of the car you would like make?");
        try{
            super.setMake(input.nextLine());
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter the name of the make");
            setMake();
        }
    }

    public void setYear() {
        System.out.println("What is the year of the car you would like make?");
        try{
            super.setYear(input.nextInt());
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter a number for the year");
            setYear();
        }

    }

    public void setModel() {
        System.out.println("What is the model of the car you would like make?");
        try{
            super.setModel(input.nextLine());
        }catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter the name of the model");
            setModel();
        }
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        System.out.println("The current car is a "+getYear()+" " + getMake() + " " + getModel()+". It's going "+getSpeed()+" MPH and has "+getGas()+"% gas left");
    }

    public void driveCar(Car car){
        for(int seconds = 0; seconds <= 5; seconds++){
            //Get current gas
            //Get current speed

            if(car.getGas() > 0){
                car.setSpeed(car.getSpeed()+1);
                car.setGas(car.getGas()-1);
            }
            else {
                car.setSpeed(0);
                break;
            }

            System.out.println("The "+car.getYear()+ " " +car.getMake()+ " "+car.getModel()+ " is going "+ car.getSpeed()+ " MPH"+ " it has "+ car.getGas()+ "% of its gas left");
        }

        mainMenu.menu(car);

    }

    public void stopCar(Car car){
        for (int seconds = 5; seconds >= 0; seconds--){
            if(car.getSpeed() > 1){
                car.setSpeed(car.getSpeed()-1);
                car.setGas(car.getGas()-1);
            }
            else {
                car.setSpeed(0);
                System.out.println("Your car has stopped. Current gas: "+car.getGas()+"%");
                break;
            }

            System.out.println("The "+ car.getYear()+" "+car.getMake()+ " "+car.getModel()+ " is going "+ car.getSpeed()+ " MPH"+ " it has "+ car.getGas()+ "% of its gas left");
        }
        mainMenu.menu(car);
    }

    public void addGas(Car car){
        car.setGas(100);
        System.out.println(car.getYear()+" " +car.getMake()+ " "+car.getModel()+" has a full gas tank");
        mainMenu.menu(car);
    }
}
