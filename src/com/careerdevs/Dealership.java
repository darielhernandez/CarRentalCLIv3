package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    // 6. Dealership class
        private String dealershipName;
        private List<Car> availableCars;
        private List<Car> soldCars;

        // 7. constructor for dealership class-- this constructor is a bit different than a traditional constructor.
        public Dealership(String dealershipName) {
            this.dealershipName = dealershipName;
            this.availableCars = new ArrayList<>();
            this.soldCars = new ArrayList<>();
        }
        //8. create getters and setters for this class
        public String getDealershipName() {
            return dealershipName;
        }
        public void setDealershipName(String dealershipName) {
            this.dealershipName = dealershipName;
        }
        public List<Car> getAvailableCars() {
            return availableCars;
        }
        public void setAvailableCars(List<Car> availableCars) {
            this.availableCars = availableCars;
        }
        public List<Car> getSoldCars() {
            return soldCars;
        }

        public void setSoldCars(List<Car> soldCars) {
            this.soldCars = soldCars;
        }
        //9. array vs arraylist- array has a fixed length that must be specified when created and cannot be changed. Arraylist has a variable length that changes dynamically to accommodate the amount of data entered.
//        buyCar(String license)

    //11. create method to buy car
 public boolean buyCar(String license){
            //boolean= true/false
            //will return true if user input is valid license, false if invalid license.
    if (availableCars.size()==0){
        System.out.println("Sorry, no cars available");
        return true; //return true to take them back to
    }
            //11a. for loop to loop through available cars
     for(int i=0; i<availableCars.size(); i++){
         if (license.equals(availableCars.get(i).getPlate())){
             System.out.println("You've selected " + availableCars.get(i));
             soldCars.add(availableCars.get(i));
             availableCars.remove(availableCars.get(i));
             return true;//ends function
         }
     }
     System.out.println("Invalid input. No cars available with that license plate");
     return false;
}
public boolean returnCar(String license){
    if (soldCars.size()==0){
        System.out.println("Sorry, no cars available");
        return true;
    }
    //12.allow user to return car
    for(int i=0; i<soldCars.size(); i++){
        if(license.equals(soldCars.get(i).getPlate())){
            System.out.println("You've chosen to return " + soldCars.get(i) + " please walk into traffic :)");
            availableCars.add(soldCars.get(i));
            soldCars.remove(availableCars.get(i));
            return true;
        }
    }
    System.out.println("Invalid input. No cars available with that license plate");
    return false;
}
    }

