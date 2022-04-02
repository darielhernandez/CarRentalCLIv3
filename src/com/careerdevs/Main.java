package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //10. initialize scanner to be able to read user input
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    Car car1=new Car("Nissan", "Altima", 2021, "1a111");
    Car car2=new Car("Honda","Accord",2021, "2bb222");
    Car car3=new Car("Toyota", "Camry", 2021, "3cc333");
    Car car4= new Car("hyundai", "elantra", 2021, "4dd444");
        System.out.println(car1);
    }

}
