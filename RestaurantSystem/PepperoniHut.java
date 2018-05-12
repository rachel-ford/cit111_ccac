
package RestaurantSystem;

import java.util.Scanner;

public class PepperoniHut {
        
    public static void main (String args[]) {
        System.out.println("***Welcome To Pepperoni Hut***");
        menu();
        
        //creates objects for use navigating between subclasses
        int userOp;
        Order orderTicket = new Order();
        Replenish replenishTicket = new Replenish();
        Checkout check = new Checkout();
        int table [][] = new int [10] [5];
        
        //switch loop for main menu option 
        do {
            Scanner scanner = new Scanner(System.in);
            userOp = scanner.nextInt();
        
            switch (userOp) {
                case 1: 
                    orderTicket.order(table);
                    menu();
                    break;
                    
                case 2:
                    replenishTicket.replenishStock();
                    menu();
                    break;
                    
                case 3:
                    check.checkout(table);
                    menu();
                    break;
                    
                case 4:
                    break;
            } //close switch 
        } while (userOp < 4);
    } //close main
    
    //displays main menu selction options
    public static void menu() {
    System.out.println("\nSelect the option corresponding to the attached number");
    System.out.println("1: Place Order");
    System.out.println("2: Replenish Stock");
    System.out.println("3: Checkout Customer");
    System.out.println("4: Close Register");
    } //close method
} //close class