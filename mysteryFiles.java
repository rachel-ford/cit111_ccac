/*
 * Program provides user three files to view with subsequent instructions. 
 * File 1 prompts user for profile information and stores the input for later viewing.
 * File 2 generates a large number and asks the user for password
 * File 3 asks displays error message first few times through
 * then checks user's answers against healthScore to see if user passes to win prize. 
 * @author Rachel
 */
package week6;

import java.util.Random;
import java.util.Scanner;
import java.math.BigInteger;


public class mysteryFiles {
    public static void main(String args[]){
        
        //declare variables
        final String userInput;
        String password = "password";
        int userOption;
        int runThrough = 0;
        String user = null;
        String birth = null;
        String colour = null;
        int trialRun = 0; 
        int errorRun = 0;
               
        //ask for clearance password
        System.out.println("***Security clearance needed!***");
        System.out.println("Type password and press enter: ");
        
        //call upon scanners
        Scanner pass = new Scanner(System.in);
        Scanner options = new Scanner(System.in);
        
        //read user input
        userInput = pass.next();
        
        //show secret files if password is correct
        if(userInput.equals(password)){
            menu();
        
        //switch loop for files
        do {
            userOption = options.nextInt();
            
            switch(userOption) {
                case 1: 
                    if (trialRun <= 0) {
                            //call upon scanner & declare variables
                        Scanner name = new Scanner(System.in);
             
                        //if no user name is stored
                        System.out.println("Enter name to create profile");
                        user = name.next();
        
                        System.out.println("Profile created");
                        System.out.println("What is your date of birth?");
                        birth = name.next();
        
                        System.out.println("What is your favorite colour?");
                        colour = name.next();
        
                        System.out.println("To view profile press 1");
                        int view = name.nextInt();
                        runThrough++;
                        trialRun++;
                            madeProfile(runThrough, user, birth, colour, password);
                    } else {
                        madeProfile(runThrough, user, birth, colour, password);
                    }
                    break;
                case 2:
                    finance(password, runThrough);
                    runThrough += 5;
                    break;
                case 3:
                    error(runThrough, errorRun);
                    break;
                case 0: 
                    exit();
                    break;
                  
            } //close switch 
            
        } while(userOption >= 1);
        
        } //close if
        
    } //close main
    
    
    //Method provides user with menu options 
    public static void menu() {
        System.out.println("\nWelcome to the user database");
        System.out.println("Select a file to open:");
        System.out.println("1 - Personal Information");
        System.out.println("2 - Financial Records");
        System.out.println("3 - Medical History"); 
        System.out.println("Press 0 to quit at any time\n");
        
    } //close method menu
    
    //Method displays user entered profile information
    public static void madeProfile(int runThrough, String user, String birth, String colour, String password) {
            
            System.out.println("\nName: " + user);
            System.out.println("DOB: " + birth);
            System.out.println("Favorite Colour: " + colour + "\n");
            runThrough++;
            
            if(runThrough >= 5) {
            System.out.println("To change password press 9");
            
            //call scanner
            Scanner change = new Scanner(System.in);
            
            //read user input
            int passChange = change.nextInt();
            
            //switch to change password
            switch (passChange) {
                case 9:
                    System.out.println("\nEnter new password");
                    password = change.next();
                    System.out.println("Success! Password changed");
                    break;
                } //close switch
            } //close if
    } //close methd madeProfile
    
    //Method states error & way back to menu, then calls upon questionaire();
    public static void error(int errorRun, int runThrough) { 
        if(errorRun <= 1) {
        System.out.println("\nError: 404 Page Not Found");
        System.out.println("Check your connection and try again later");
            menu();
            runThrough ++;
            errorRun ++;
        } else {
            questionaire();
                errorRun++;
                runThrough++;
        }
    } //close method error
       
    //Method prompts user to eneter password and loops large number 
    public static void finance(String password, int runThrough){
        System.out.println("Oh no! Someone's trying to hack into the system!");
        System.out.println("Enter password to place firewall");
        //call scanner
        Scanner fire = new Scanner(System.in);
        
        //read user input
        password = fire.next();
        double loop = 0;
        
        //display big numbers for visual effect
        do {
            randomGenerator();
            loop += 1;
        } while(loop <= 50);
        
        System.out.println("Whew! You stopped the hacker");
        System.out.println("You may want to consider changing your password");
        System.out.println("To do so, visit the personal information file");
        runThrough += 5;
        
    } //close method finance
    
        //Method generates a big number
        public static void randomGenerator() {
            Random r = new Random();
            BigInteger bigInt = new BigInteger(300, r);
            System.out.println(bigInt);
        } //close method randomGenerator
        
    //Method prompts user for medical history and checks answers against set int
    public static void questionaire() {
        System.out.println("\nAnswer the set of questions below with simple 'yes'/'no' answers "
            + "to see if you qualify for medical care assitance");
            
        //call upon scanner
        Scanner med = new Scanner(System.in);
        int healthScore = 0;
        int numBones = 0;
        int numMeds = 0;
        
        System.out.println("Have you ever broken a bone?");
        String bone = med.next();
            if(bone.equals("yes")) {
                System.out.println("\nIf answered yes, how many?");
                numBones = med.nextInt();
            }
        
        System.out.println("\nAre you currently on any prescription medications?");
        String meds = med.next();
            if(meds.equals("yes")) {
                System.out.println("\nIf answered yes, how many?");
                numMeds = med.nextInt();
            }
            
        System.out.println("\nDoes your family have a history of heart disease?");
        String heart = med.next();
            if(heart.equals("yes")) {
                healthScore++;
            }
        
        System.out.println("\nDo you brush your teeth twice a day, regularly?");
        String teeth = med.next();
            if(heart.equals("no")) {
                healthScore++;
            }
        
        //call upon random number generator for prize
        Random n = new Random();
        
        //store the number
        int num = n.nextInt();
            
        //calculate healthScore using user inputed answers
        healthScore = healthScore + numMeds + numBones;
            if(healthScore <= 5) {
                System.out.println("\nCongrats! You qualify for medical care assitance!");
                System.out.println("Here is your prize of " + num + " free tacos.");
            } else {
                System.out.println("\nSorry! Based on your past medical history you don't qualify for medical care assitance");
                System.out.println("Maybe try being someone else");
            } //close if/else
        
    } //close method questionaire 
        
    //Method provides loop exit
    public static void exit() {
        System.out.println("Thank you for using our database.");
        System.out.println("Security measures intact.");
        
    } //close method exit
    
} //close class
