package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //10. initialize scanner to be able to read user input

        //3. create 3 instances of cars inside of main class
        Car car1 = new Car("Nissan", "Altima", 2021, "1A");
        Car car2 = new Car("Honda","Accord",2021, "2B");
        Car car3 = new Car("Toyota", "Camry", 2021, "3C");

        //8. create new dealership instance and give it a name
        Dealership dealership= new Dealership("Java Motors");
        //9. add car instances to arrayList
        dealership.getAvailableCars().add(car1);
        dealership.getAvailableCars().add(car2);
        dealership.getAvailableCars().add(car3);

        //BONUS MATERIAL--
        System.out.println("Hello! Welcome to " + dealership.getDealershipName());
        //create a while loop
        while (true){
            System.out.println("Would you like to 1) Buy a car 2) Return a car 3) Leave the dealership");
            int res=0;
            //in this while loop, we are creating a try/catch method-- explain to me what that is.
            try{ //we have code that is prone to throw an exception
                res= scanner.nextInt();
                scanner.nextLine();//need this to move you down to the next line. otherwise courser stays at previous line

            }catch (Exception e){
                System.out.println("Invalid input, please select an option from the menu");
                scanner.nextLine();
            }
            if(res ==3) {
                System.out.println("You are now leaving the dealership...");
                break;
            }else if(res==2){
                //return car logic here
                while (true){
                System.out.println("Which car would you like to return? Please input the License plate");
                for (int i=0; i<dealership.getSoldCars().size(); i++){
                    System.out.println(dealership.getSoldCars().get(i));
                }
                    String userinput = scanner.nextLine();// expects license plate input from user
                   boolean isValidInput= dealership.buyCar(userinput);
                    System.out.println(dealership.getAvailableCars());
                    System.out.println(dealership.getSoldCars());
                }
            }else if (res==1) {
                while (true){
                    System.out.println("Please select plate number");
                    for (int i = 0; i < dealership.getAvailableCars().size(); i++) {
                        System.out.println(dealership.getAvailableCars().get(i));
                    }
                    String userinput = scanner.nextLine();// expects license plate input from user
                    boolean isValidInput= dealership.buyCar(userinput);//returns a boolean
                    System.out.println(dealership.getAvailableCars());
                    System.out.println(dealership.getSoldCars());
                    if (isValidInput){
                        break;
                        }
                    }
                //buy car logic here
            }else{
                    System.out.println("Invalid input! Please select an option from the menu");
                }
            }
        }
    }

