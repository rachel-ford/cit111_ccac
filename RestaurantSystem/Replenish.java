
package RestaurantSystem;

import java.util.Scanner;

public class Replenish extends Kitchen{
    
    String userChoice;
    int userNumber;
    
    //prompts user for item to restock & adjusts quantities accordingly
    public void replenishStock() {
    do {
        System.out.println("\nWhich item do you wish to replenish? *Note: case sensitivity*");
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.next();
        
        if (userChoice.equals("Cheese")) {
            System.out.println("\nHow much cheese would you like to restock?");
            userNumber = scanner.nextInt();
            cheese += userNumber;
            System.out.println("Item replenished!");
        } //close if 
        
        if (userChoice.equals("Sauce")) {
            System.out.println("\nHow much sauce would you like to restock?");
            userNumber = scanner.nextInt();
            sauce += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Pepperoni")) {
            System.out.println("\nHow much pepperoni would you like to restock?");
            userNumber = scanner.nextInt();
            pepperoni += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Mushroom")) {
            System.out.println("\nHow many mushrooms would you like to restock?");
            userNumber = scanner.nextInt();
            mushroom += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Sausage")) {
            System.out.println("\nHow much sausage would you like to restock?");
            userNumber = scanner.nextInt();
            sausage += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Crust")) {
            System.out.println("\nHow much crust would you like to restock?");
            userNumber = scanner.nextInt();
            crust += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Lettuce")) {
            System.out.println("\nHow much lettuce would you like to restock?");
            userNumber = scanner.nextInt();
            lettuce += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Croutons")) {
            System.out.println("\nHow many croutons would you like to restock?");
            userNumber = scanner.nextInt();
            crouton += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Dressing")) {
            System.out.println("\nHow much dressing would you like to restock?");
            userNumber = scanner.nextInt();
            dressing += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Buns")) {
            System.out.println("\nHow many buns would you like to restock?");
            userNumber = scanner.nextInt();
            buns += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Chicken")) {
            System.out.println("\nHow much chicken would you like to restock?");
            userNumber = scanner.nextInt();
            chicken += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Fish")) {
            System.out.println("\nHow much fish would you like to restock?");
            userNumber = scanner.nextInt();
            fish += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Steak")) {
            System.out.println("\nHow much steak would you like to restock?");
            userNumber = scanner.nextInt();
            steak += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Bread")) {
            System.out.println("\nHow much bread would you like to restock?");
            userNumber = scanner.nextInt();
            bread += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Garlic")) {
            System.out.println("\nHow much garlic would you like to restock?");
            userNumber = scanner.nextInt();
            garlic += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Butter")) {
            System.out.println("\nHow much butter would you like to restock?");
            userNumber = scanner.nextInt();
            butter += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Coke")) {
            System.out.println("\nHow many coke cartridges would you like to restock?");
            userNumber = scanner.nextInt();
            coke += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Pepsi")) {
            System.out.println("\nHow many pepsi cartridges would you like to restock?");
            userNumber = scanner.nextInt();
            pepsi += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Root Beer")) {
            System.out.println("\nHow many root beer cartridges would you like to restock?");
            userNumber = scanner.nextInt();
            rootBeer += userNumber;
            System.out.println("Item replenished!");
        } //close if
        
        if (userChoice.equals("Sprite")) {
            System.out.println("\nHow many sprite cartridges would you like to restock?");
            userNumber = scanner.nextInt();
            sprite += userNumber;
            System.out.println("Item replenished!");
        } //close if
        System.out.println("Do you wish to replenish another item?");
        userChoice = scanner.next();
    } while(!userChoice.equals("No"));
    } //close method
} //close class
