package objects1;
import java.util.Scanner;

public class DessertLand {
    public static int loop = 0;
    
    public static void main (String args[]) {
        double firstBite = 0;
       
        //create handle variables and dessert objects that tie to class instances
        Donut firstDonut;
        firstDonut = new Donut();
        
        Cupcake firstCake;
        firstCake = new Cupcake();
        
        Cookie firstCookie;
        firstCookie = new Cookie();
        
        //prompt user for what they'd like to eat & collect data
        System.out.println("\nWhat would you like to eat?"
                + "\nDonut\n"
                + "Cupcake\n"
                + "Cookie\n");
        Scanner scanner = new Scanner(System.in);
        String userOp = scanner.next();
        
        //switch & loop to choose which item to eat and to continue eating
        do{ firstBite = firstBite + 0.1;
            switch(userOp) {
                case "Donut":
                    firstDonut.simulateEating(firstBite);
                    printDivider();
                    displayDonutInfo(firstBite, firstDonut);
                    printDivider();
                    keepEating();
                    break;
                    
                case "Cupcake":
                    firstCake.eatCake(firstBite);
                    printDivider();
                    displayCakeInfo(firstBite, firstCake);
                    printDivider();
                    keepEating();
                    break;
                    
                case "Cookie":
                    firstCookie.eatCookie(firstBite);
                    printDivider();
                    displayCookieInfo(firstBite, firstCookie);
                    printDivider();
                    keepEating();
                    break;
                    
            } //close switch 
        }while(loop == 0);
    } //close main
    
    private static void printDivider() {
        System.out.println("..............................................");
    }
    
    //displays nutrition facts on items consumed
    public static void displayDonutInfo(double firstBite, Donut firstDonut) {
        System.out.println("You have eaten " + firstBite + " of your donut.\n");
        System.out.println("Total sugar consumed: " + firstDonut.displaySugar() + " grams.");
        System.out.println("Total fat consumed: " + firstDonut.displayFat() + " grams.");
        System.out.println("Total calories consumed: " + firstDonut.displayCalories());
        firstDonut.donutReset();
    } //close method
    
    public static void displayCakeInfo(double firstBite, Cupcake firstCake) {
        System.out.println("You have eaten " + firstBite + " of your cupcake.\n");
        System.out.println("Total sugar consumed: " + firstCake.displaySugar() + " grams.");
        System.out.println("Total fat consumed: " + firstCake.displayFat() + " grams.");
        System.out.println("Total calories consumed: " + firstCake.displayCalories());
        firstCake.cakeReset();
    } //close method
    
    public static void displayCookieInfo(double firstBite, Cookie firstCookie) {
        System.out.println("You have eaten " + firstBite + " of your cookie.\n");
        System.out.println("Total sugar consumed: " + firstCookie.displaySugar() + " grams.");
        System.out.println("Total fat consumed: " + firstCookie.displayFat() + " grams.");
        System.out.println("Total calories consumed: " + firstCookie.displayCalories());  
        firstCookie.cookieReset();
    } //close method
        
    //loop exit method 
    public static void keepEating() {
        System.out.println("Keep eating?\n");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        
        if(userInput.equals("No")) {
            loop = 5;}
    } //close method
    
} //close class
