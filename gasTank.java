/*
 *Program to calculate if user can travel to service station 
 *with remaining user-entered statistics based on mpg of vehicle,
 *miles left to travel, and the gallons left in the vehicle. 
 */
    //@author Rachel Ford
package week4;

import java.util.Scanner;

public class gasTank {
    public static void main(String args[]){
        
        //declare variables
        double gasLeft; 
        double milesLeft;
        int mpg;
        double calc;
        double calcLeft;
        double calcGLeft;
        double calcMpg;
        
        //create scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        //prompt user on mpg
        System.out.println("Gas Mileage Calculator");
        System.out.println("What is the miles per gallon rating of your vehicle?");
        
        //read user input
        mpg = userInputScanner.nextInt();
                
        //prompt user on remaining gallons
        System.out.println();
        System.out.println("How many gallons of gas remain in your tank?");
       
        //read user input
        gasLeft = userInputScanner.nextDouble();
        
        //prompt user on remaining miles
        System.out.println();
        System.out.println("How many miles to the next service station?");
        
        //read user input
        milesLeft = userInputScanner.nextDouble();
        
        //calculate remaining miles car can travel
        calc = gasLeft * mpg; 
        
        //check if calculation is less than remaining distance to travel
        if(calc >= milesLeft){
            System.out.println("You will successfully make it to the next gas station.");
            calcLeft = calc - milesLeft;
            System.out.println();
            System.out.println("There will be " + calcLeft + " miles remaining after reaching destination.");
        } else {
            System.out.println();
            System.out.println("Oh no! You will not make it to the next gas station.");
            System.out.println();
            System.out.println("You can travel a total of: " + calc + " miles before running out of fuel.");
            System.out.println();
            
            //calc necessary gas 
            calcGLeft = milesLeft / mpg;
            System.out.println(calcGLeft + " gallons of gas is necessary to make it to the next service station.");
            System.out.println();
            
            calcMpg = milesLeft / gasLeft;
            System.out.println("A mpg rating of: " + calcMpg + " is needed to reach destination.");
            
        }
        
        
    } //close main method
    
} //close class gasTank
