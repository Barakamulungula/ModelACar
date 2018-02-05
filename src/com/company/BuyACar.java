package com.company;

import java.util.Scanner;

public class BuyACar {

    Bmw bmw1 = new Bmw("BMW",2018,"Black",40000,"3 series");
    public Scanner input = new Scanner(System.in);

    protected void Start(){
        System.out.println("Do you wish to buy a (built car) or make a (new car) ('1','2') or ('exit')");
        if(input.hasNextLine()){
            String answer = input.nextLine();
            switch (answer.toUpperCase()) {
                case "1":
                    System.out.println("Brand: " + bmw1.getBrand() + "\nModel: " + bmw1.getModel());
                    break;
                case "2":
                    System.out.println("New car");
                case "EXIT":
                    System.exit(0);

                default:
                    System.out.println("error invalid input enter ('Y','N') or ('exit') ");
                    Start();
                    break;
            }

        }

        else{
            System.out.println("error invalid input");
            Start();
        }

    }

}
