
package week5;

import java.util.Random;
import java.util.Scanner;

        
/**
 * Math checker that randomly generates math problems for the user to input solutions to.
 * After 3 consecutive incorrect answers the checker quits.
 * Level of difficulty changes dependent upon correct user input. 
 * @author Rachel
 */
public class quizSpecs {
    public static void main(String args[]){
        
        //declare variables
        int threshold = 30;
        int userAnswer;
        int numLoops = 0 ;
        
        //call upon number generator
            Random randGenerator = new Random();
        
            //store the numbers
            int firstInt = randGenerator.nextInt(threshold);
            int secondInt = randGenerator.nextInt(threshold);
            int thirdInt = randGenerator.nextInt(threshold);
            int numFail = 0;
            int correct = 0;
        
        System.out.println("**Math Checker**");
        
        //make loop
        while(true){
            
            System.out.println("Compute the value of " + firstInt + " * " + secondInt + " / " + thirdInt + ":"); 
            System.out.println("(Round down to closest whole number.)");
            numLoops = numLoops + 1;
            
            //call upon scanner
            Scanner inputScanner = new Scanner(System.in);
            
            //read user input and store in variable
            userAnswer = inputScanner.nextInt();
            
            //calc answer
            int answer;
            answer = firstInt * secondInt / thirdInt;
            
            //give definition to what occurs during the loop on user specific answers
            if(answer == userAnswer){
                System.out.println("Correct! Good job");
                System.out.println("Solution: (" + firstInt + " * " + secondInt + ") / " + thirdInt + " = " + (firstInt * secondInt) + " / " + thirdInt + " = " + answer);
                System.out.println();
                correct = correct + 1;
                
                //call upon number generator
                randGenerator = new Random();
        
                //store the numbers
                 firstInt = randGenerator.nextInt(threshold);
                 secondInt = randGenerator.nextInt(threshold);
                 thirdInt = randGenerator.nextInt(threshold);
                
                //repeating loop with larger intergered questions
                threshold = threshold + 15;
                
                
            } else{
                numFail = numFail + 1;
                System.out.println("Sorry, your answer is incorrect. Try again");
                
                //decrease dificulty
                threshold = threshold - 10;
                
                //give user hint on location of their incorrect answer
                if(userAnswer > answer){
                System.out.println("(Your answer is too high)");
                } else{
                    System.out.println("(Your answer is too low)");
                } //close else #2
                
                System.out.println("******");
                System.out.println();
            } //close else
            
            if(numLoops >=5){
                System.out.println("You have reached the end of the checker.");
                System.out.println("Thank you for participating!");
                
                //calc total score
                System.out.println("Total score: " + correct + " / " + numLoops);
                break;
            }
            
            //exit protocol after 3 failed user attempts
                if(numFail >= 3){
                    System.out.println("You have reached 3 consecutive failed attempts!");
                    System.out.println("The correct answer is: " + answer);
                    System.out.println("Solution: (" + firstInt + " * " + secondInt + ") / " + thirdInt + " = " + (firstInt * secondInt) + " / " + thirdInt + " = " + answer);
                    break;
                } //close if #3
            
        } //close while
        
    } //close main
} //close class
