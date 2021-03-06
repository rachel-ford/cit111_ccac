/* Allows user to convert between Fahrenheit, Celsius, and Kelvin.
 * Additional heat content calculator attached to converter. 
 * Bonus round intitiates after 5 conversions. 
 * Bonus round allows user to convert between three wacky conversions.
 * Website used for conversion equations: http://www.allmeasures.com/temperature.html
 */
package week8_methods2;

import java.util.Scanner;

public class ConversionChart {
    public static void main(String args[]) {
        //declare variables
        double result1 = 0;
        double result2 = 0;
        double result3 = 0;
        double result4 = 0;
        
        System.out.println("****Unit Converter****");
        
        Scanner scanner = new Scanner(System.in);
        
        menu();
        int userOption;
        int runThrough = 0;
        
       //switch between 3 conversions
       do {
        userOption = scanner.nextInt();
        
        switch (userOption) {
            case 1: 
                fare(runThrough, result1);
                runThrough++;
                break;
            case 2:
                cel(runThrough, result1, result2);
                runThrough++;
                break;
            case 3:
                kelvin(runThrough, result2, result3);
                runThrough++;
                break;
            case 4: 
                joules(runThrough, result4);
                runThrough++;
                break;
            case 0: 
                break;
        } 
        
        //bonus round initiator
        if(runThrough >= 5) {
            bonusRound();
            break;
        } //close if
        
        } while(userOption > 0); //close switch loop
        
    } //close main
    
    //method displays menu
    public static void menu() {
        System.out.println("Select converter to enter");
        System.out.println("-------------------------------");
        System.out.println("1: Fahrenheit to Celsius");
        System.out.println("2: Celsius to Kelvin");
        System.out.println("3: Kelvin to Farenheit");
        System.out.println("4: Joules Calculator");
        System.out.println("0: Exit\n");
            
    } //close method
    
    //method converts farenheit to Calsius
    public static double fare(int runThrough, double result1) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit temperature you wish to convert to Celsius");
        
        double fare = temp.nextInt();
        result1 = (fare - 32) * 5/9;
        System.out.println("The temperature in Celsius is " + result1 + "\n");
        runThrough++;
        menu();
        return result1;
    } //close method
    
    //method converts celsius to kelvin
    public static double cel(int runThrough, double result1, double result2) {
        Scanner temp = new Scanner(System.in);
                
        if(runThrough >= 1) {
            System.out.println("To use Celsius temperature previously calculated press enter\n"
                    + "To enter new temperature press 2");
            String enterkey = temp.nextLine();
            if(enterkey.equals("")) {
                result2 = result1 + 273.15;
                System.out.println("The temperature in Kelvin is " + result2 + "\n");
            } else {
            System.out.println("Enter the Celsius temperature you wish to convert to Kelvin");
            double cel = temp.nextInt();
            result2 = cel + 273.15;
            System.out.println("The temperature in Kelvin is " + result2 + "\n");
            runThrough++; } //close if/else
           return result2;
        } //close if
        
        System.out.println("Enter the Celsius temperature you wish to convert to Kelvin");
        
        double cel = temp.nextInt();
        result2 = cel + 273.15;
        System.out.println("The temperature in Kelvin is " + result2 + "\n");
        runThrough++;
        menu();
        return result2;
    } //close method
    
    //method converts kelvin to farenheit
    public static double kelvin(int runThrough, double result2, double result3) {
        Scanner temp = new Scanner(System.in);
        
        if(runThrough >= 1) {
            System.out.println("To use Kelvin temperature previously calculated press enter\n"
                    + "To enter new temperature press 3");
            String enterkey = temp.nextLine();
            if(enterkey.equals("")) {
                result3 = (result2 - 273.15) * (9/5) + 32;
                System.out.println("The temperature in Farenheit is " + result3 + "\n");
            } else {
            System.out.println("Enter the Kelvin temperature you wish to convert to Farenheit");
            double kelvin = temp.nextInt();
            result3 = (kelvin - 273.15) * (9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + result3 + "\n");
            runThrough++; } //close if/else
           return result3;
        } //close if
        
        System.out.println("Enter the Kelvin temperature you wish to convert to Fahrenheit");
        
        double kelvin = temp.nextInt();
        result3 = (kelvin - 273.15) * (9/5) + 32;
        System.out.println("The temperature in Fahrenheit is " + result3 + "\n");
        runThrough++;
        menu();
        return result3;    
    } //close method
    
    //method calculates heat content in joules
    public static double joules(int runThrough, double result4) {
        //website used for calculation equation: https://www.softschools.com/formulas/physics/heat_transfer_formula/41/
        Scanner temp = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("To calculate the heat content of an object please enter the mass of the object");
        double mass = temp.nextInt();
        
        System.out.println("Enter the specific heat of the object in J/°C for 100 grams");
        double heat = temp.nextInt();
        
        System.out.println("Enter the change in temperature (ΔT)");
        double change = temp.nextInt();
        
        result4 = mass * (heat/100) * change;
        System.out.println("The energy transferred in Joules is " + result4 + "\n");
        runThrough++;
        menu();
        return result4;
    } //close method
    
    //method displays bonus round of wacky conversions
    public static void bonusRound() {
        System.out.println("\n***You've entered the bonus round***\n"
                + "Select converter to enter\n"
                + "1: NASCAR Winston Cup Tires to eyeballs\n"
                + "2: Panama Canals to human licks\n"
                + "3: Great Walls of China to T-Rex\n");
        Scanner option = new Scanner(System.in);
        int userOp;
        do {
            userOp = option.nextInt();
            
            switch(userOp) {
                case 1:
                    cupToEyes();
                    break;
                case 2:
                    lickPanama();
                    break;
                case 3:
                    chinaRex();
                    break;
                case 0:
                    break;
            } //close switch
        } while(userOp > 0);
        
    } //close method
    
    //method converts cup tires to eyeballs
    public static void cupToEyes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of NASCAR Winston Cup Tires to convert to human eyes in lbs");
        double input1 = scanner.nextInt();
        
        double ans = (input1 * 23)/ 0.0625;
        System.out.println("There are " + ans + "eyeballs in " + input1 + " Winston Cup Tires");
    } //close method
    
    //method converts panama canals to human licks
    public static void lickPanama() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of Panama Canals to convert to human licks in inches");
        double input2 = scanner.nextInt();
        
        double ans = (input2 * 3168000)/ 2;
        System.out.println("There are " + ans + "licks in " + input2 + " Panama Canals");
    } //close method
    
    //method converts great walls to t-rex
    public static void chinaRex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of Great Walls of China to convert to T-Rex in inches");
        double input3 = scanner.nextInt();
        
        double ans = (input3 * 251968504)/ 472.4409;
        System.out.println("There are " + ans + "T-Rex in " + input3 + " Great Walls of China");
    } //close method
    
} //close class
