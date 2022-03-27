package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
    // 6. Dealership class
    public class Dealership {
        private String javaMotors;
        private List<Car> availableCars;
        private List<Car> soldCars;

        // 7. constructor for dealership class-- this constructor is a bit different than a traditional constructor.
        public Dealership(String javaMotors){
            this.javaMotors= javaMotors;
            this.availableCars= new ArrayList<>();
            this.soldCars= new ArrayList<>();
        }
        //8. create getters and setters for this class
        public String getJavaMotors(){
            return javaMotors;
        }
        public void setJavaMotors(String javaMotors){
            this.javaMotors=javaMotors;
        }
        public List<Car> getAvailableCars() {
            return availableCars;
        }
        public void setAvailableCars(List<Car> availableCars){
            this.availableCars=availableCars;
        }
        public List<Car> getSoldCars(){
            return soldCars;
        }
        public void setSoldCars(List<Car> soldCars){
            this.soldCars=soldCars;
        }
        //9. array vs arraylist- array has a fixed length that must be specified when created and cannot be changed. Arraylist has a variable length that changes dynamically to accommodate the amount of data entered.
    }
}
