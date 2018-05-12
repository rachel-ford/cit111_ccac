
package RestaurantSystem;

import java.util.Scanner;

public class Checkout extends Replenish {

    //member variables 
    private final double tax = 0.07;
    private final double pizzaPrice = 12.99;
    private final double saladPrice = 9.99;
    private final double sandwhichPrice = 6.99;
    private final double garlicBreadPrice = 5.99;
    private final double fountainDrinkPrice = 1.99;
    private final double toppingPrice = 1.25;
    
    public int pizzaTotal;
    public int saladTotal;
    public int sandwhichTotal;
    public int garlicBreadTotal;
    public int fountainDrinkTotal;
    
    //calls upon table order & displays reciept
    public void checkout(int table [][]) {
        System.out.println("\nWhat table would you like to checkout?");
        Scanner scanner = new Scanner(System.in);
        tableNum = scanner.nextInt();
        System.out.println("\nReceipt");
        System.out.println("***********");
        
        //calculates pizza total 
        if(table [tableNum] [0] > 0) {
            pizzaTotal = (int) (table [tableNum] [0] * pizzaPrice);
            System.out.println("Pizza: $" + pizzaTotal);
            
            //displays price of toppings if toppings are ordered
            if (toppingNumber > 0) {
                System.out.println(" Toppings: $" + (toppingPrice * toppingNumber));
            } //close nested if 
        } //close if 
        
        //calculates salad total 
        if(table [tableNum] [1] > 0) {
            saladTotal = (int) ( table [tableNum] [1] * saladPrice);
            System.out.println("Salad: $" + saladTotal);
        } //close if 
        
        //calculates sandwhich total 
        if(table [tableNum] [2] > 0) {
            sandwhichTotal = (int) (sandwhichPrice * table [tableNum] [2]);
            System.out.println("Sandwhich: $" + sandwhichTotal);
        } //close if 
        
        //calculates garlic bread total 
        if(table [tableNum] [3] > 0) {
            garlicBreadTotal = (int) (garlicBreadPrice * table [tableNum] [3]);
            System.out.println("Garlic Bread: $" + garlicBreadTotal);
        } //closee if 
        
        //calculates fountain drink total 
        if(table [tableNum] [4] > 0) {
            fountainDrinkTotal = (int) (fountainDrinkPrice * table [tableNum] [4]);
            System.out.println("Fountain Drink: $" + fountainDrinkTotal); 
        } //close if 
        
        //calculates total price, sales tax, and grand total due. 
        double grandTotal = pizzaTotal + saladTotal + sandwhichTotal + garlicBreadTotal + fountainDrinkTotal;
        System.out.println("Total: $" + grandTotal);
        double orderTax = tax * grandTotal;
        System.out.println("Tax: $" + orderTax);
        grandTotal = grandTotal + orderTax;
        System.out.println("Grand Total: $" + grandTotal);
    } //close method
} //close class
