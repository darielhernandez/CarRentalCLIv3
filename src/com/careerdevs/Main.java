package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //10. initialize scanner to be able to read user input

        //3. create 3 instances of cars inside of main class
        Car car1 = new Car("Nissan", "Altima", 2021, "1AA111");
        Car car2 = new Car("Honda","Accord",2021, "1AA112");
        Car car3 = new Car("Toyota", "Camry", 2021, "1AA113");

        //8. create new dealership instance and give it a name
        Dealership dealership= new Dealership("Java Motors");
        //9. add car instances to arrayList
        dealership.getAvailableCars().add(car1);
        dealership.getAvailableCars().add(car2);
        dealership.getAvailableCars().add(car3);

        System.out.println("Please select a vehicle");
        for (int i=0; i<dealership.getAvailableCars().size(); i++){
            System.out.println(dealership.getAvailableCars().get(i));
        }
        System.out.println("Please select plate number");

        String userinput= scanner.nextLine();
        dealership.buyCar(userinput);
    }

}