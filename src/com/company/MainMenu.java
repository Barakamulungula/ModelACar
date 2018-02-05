package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void creatorCar(){
        Car car = new Car();
        car.getCarInfo();
        menu(car);
    }

    public void menu(Car car){

        System.out.println("\nWhat would you like to do with the "+ car.getMake() + " " + car.getModel()+ "?" );
        System.out.println("1. Accelerate \n2. Decelerate \n3. Fill up with gas\n4. Exit");
        try{
            switch (input.nextInt()){
                case 1:
                    //accelerate
                    car.driveCar(car);
                    break;
                case 2:
                    //decelerate
                    car.stopCar(car);
                    break;
                case 3:
                    //Fill up with gas
                    car.addGas(car);
                    break;
                case 4:
                    //Exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and four");
                    menu(car);
                    break;

            }
        } catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please enter between one and four");
            menu(car);
        }
    }
}
