/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author twixf
 */
public class RoadTrip {
    @SuppressWarnings({"UnusedAssignment", "empty-statement"})
    public static void main(String args[]){
        
        final double NEDS_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        //declaring and initializing variables
        String carMake = "1996 MAzda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; //declaring this variable but not initializing 
        
        //simulation of the roadtrip
        System.out.println("***Road Trip Simulator***");
        //print out initial stats
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer; " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println("Starting tripp with " + currentNumberOfPassengers + " Passengers");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("************************************************************");
        
        System.out.println();
        System.out.println("Beginning leg 1:");
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = decimalOfOneQuarter * distanceToMoabUtah;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
                
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading West
        System.out.println("Oh, look! A person who wants to go west, too!");
        
        // Check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            //alternative shorter version: currentNumberOfPassengers++
        } // closes if()
        
        // Calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / NEDS_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        // deduct $ spent on gas from money remaining and over-write tripBudget
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        //reprint status of variables to the console
        System.out.println();
        System.out.println("****Variable stats at end of leg 1****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("************************************************************");
        
        System.out.println("");
        System.out.println("Beginning leg 2:");
        
        // declare variables
        legDistance = 500.0;
        System.out.println("Check leg distance: " + legDistance);
        
        // update trip odometer
        tripOdometer = tripOdometer + legDistance; 
        
        // calculate distance of leg 2
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // find pair of hitchers
        System.out.println("Oh look, another pair of hitchhikers!");
        
        // Check to see if there is room in the car, if so, pick them up
        if(carFull ==false){
            System.out.println("Car is not full, picking up hitchhikers.");
            currentNumberOfPassengers++;
            currentNumberOfPassengers++;
        } //closes if
        
        //Calculate price of gas for second leg and store in temp variable
        double gasPriceLeg2 = ( legDistance / NEDS_MILES_PER_GALLON ) * AVERAGE_GAS_PRICE;
        
        // deduct $ spent on gas from money remaining and over-write tipBudget
        cashOnHand = cashOnHand - gasPriceLeg2;
        
        // print out leg 2 stats
        System.out.println();
        System.out.println("****Variable stats at end of leg 2****");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("************************************************************");
        
        System.out.println();
        System.out.println("Beginning leg 3:");
        
        // declaring and initializing leg 3 variables
        legDistance = distanceToMoabUtah;
        System.out.println("Check leg distance: " + legDistance);
        
        //update odometer
        tripOdometer = tripOdometer + legDistance;
        
        // find another pair of hitchers
        System.out.println("Wow! Another couple of hikers looking to travel West!");
        
        // Check to see if there is room in the car, if so, pick them up
        carFull = true;
        if(carFull == true){
            System.out.println("Oh no! Car is full. Bypassing hikers.");
        } // close if
                
        // Calculate price of gas for third leg and store in temp variable
        double gasPriceLeg3 = ( legDistance / NEDS_MILES_PER_GALLON ) * AVERAGE_GAS_PRICE; 
        
        // deduct $ spent on gas and adjust cashOnHand
        cashOnHand = cashOnHand - gasPriceLeg3;
        
        // arrive at destination, toggling boolean variable
        destinationReached = true; 
        
        // print out final stats
        System.out.println();
        System.out.println("****Variable stats at end of leg 3****");
        System.out.println("Distance To Destination: " + "0");
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
    } // close class main
    
} // close class RoadTrip
