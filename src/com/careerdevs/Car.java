package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

//2. Car class with 3 properties
public class Car {
    //3. constructor- used to create (car) objects from the (car)"blueprint" that is the (Car)class.
    //create the constructor and have it take in a *parameter*, in this case, its String make, String model, int year, String plate
    public Car(String make, String model, int year, String plate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.plate= plate;
    }
    //4. getters and setters// used to more securely access data. Allows you to be able to access private objects.

    //four properties.
    private String make;
    private String model;
    private int year;//clarify between integer and int.-- Integer is a wrapper class. It can store references to int
    private String plate;

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getPlate(){
        return plate;
    }
    public void setPlate(String plate){
        this.plate=plate;
    }

    //5.create an @Override .toString() method that will print out readable details about our Car object
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", plate='" + plate + '\'' +
                '}';
    }

}



