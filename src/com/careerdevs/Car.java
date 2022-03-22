package com.careerdevs;

//2. Car class with 3 properties
public class Car {

    //three properties.
    private String make;
    private String model;
    private int year;//clarify between integer and int.-- Integer is a wrapper class. It can store references to int


    //3. constructor- used to create (car) objects from the (car)"blueprint" that is the (Car)class.
    //create the constructor and have it take in a *parameter*, in this case, its String make, String model, int year
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //4. getters and setters// used to more securely access data. Allows you to be able to access private objects.

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
}

