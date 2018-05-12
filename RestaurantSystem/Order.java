
package RestaurantSystem;

import java.util.Scanner;

public class Order {
    //member variables 
    int tableNum; 
    String userInput;
    public int pizza; 
    public int salad; 
    public int sandwhich;
    public int garlicBread;
    public int fountainDrink;
    public int toppingNumber;
    public int runThrough = 0;
    public String toppingChoice;
    public String popType;
    public String meat;
    
    //places order for a specific table using a one dimemsional array
    public void order(int table [][]) {
        Scanner scanner = new Scanner(System.in);
        
        do {
        //prompt for table number
        if(runThrough == 0) {
            System.out.println("\nWhat is the table number you'd like to place an order for?");
            tableNum = scanner.nextInt();
        }
        
        //loop for food item order placement
           foodMenu();
           userInput = scanner.next();
           
           switch(userInput) {
               case "p":
                   pizza(table, tableNum);
                   runThrough++;
                   break;
                   
               case "s":
                   salad(table, tableNum);
                   runThrough++;
                   break;
                   
               case "w":
                   sandwhich(table, tableNum);
                   runThrough++;
                   break;
                   
               case "g":
                   garlicBread(table, tableNum);
                   runThrough++;
                   break;
                   
               case "d":
                   fountainDrink(table, tableNum);
                   runThrough++;
                   break;
                   
               case "f":
                   System.out.println("\nOrder sent to kitchen.");
                   Kitchen kitchenTicket = new Kitchen();
                   kitchenTicket.orderLine(pizza, salad, sandwhich, garlicBread, fountainDrink, toppingChoice, meat, popType);
                   break;
           } //close switch
        } while(!userInput.equals("f")); 
        userInput = "";
        runThrough = 0;
        
    } //close method
    
    //method displays food option menu
    public void foodMenu() {
    System.out.println("\nSelect item to order in corresponding []");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[w] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[d] Fountain Drink");
    System.out.println("[f] Finish Order");
    } //close method
    
    //method prompts for number of pizzas ordered and adds to table
    public void pizza(int table [][], int tableNum) {
        System.out.println("\nEnter the number of Pizzas ordered");
        Scanner scanner = new Scanner(System.in);
        pizza = scanner.nextInt();
        table[tableNum] [0] = pizza; 
        
        System.out.println("\nAny toppings?"
                + "\nPepperoni"
                + "\nMushroom"
                + "\nSausage");
        toppingChoice = scanner.next();
        
        System.out.println("\nItem added to order!");
    } //close method
    
    //method prompts for number of salads ordered and adds to table
    public void salad(int table [][], int tableNum) {
        System.out.println("\nEnter the amount of Salads ordered");
        Scanner scanner = new Scanner(System.in);
        salad = scanner.nextInt();
        table[tableNum] [1] = salad;
        System.out.println("\nItem added to order!");
    } //close method
    
    //method prompts for number of sandwhiches ordered and adds to table
    public void sandwhich(int table [][], int tableNum) {
        System.out.println("\nEnter the amount of Sandwiches ordered");
        Scanner scanner = new Scanner(System.in);
        sandwhich = scanner.nextInt();
        table[tableNum] [2] = sandwhich;
        
        System.out.println("\nWhat type of meat?"
                + "\nChicken"
                + "\nSteak"
                + "\nFish");
        meat = scanner.next();
        
        System.out.println("\nItem added to order!");
    } //close method
    
    //method prompts for number of sandwhiches ordered and adds to table
    public void garlicBread(int table [][], int tableNum) {
        System.out.println("\nEnter the amount of Garlic Bread ordered");
        Scanner scanner = new Scanner(System.in);
        garlicBread = scanner.nextInt();
        table[tableNum] [3] = garlicBread;
        System.out.println("\nItem added to order!");
    }
    
    //method prompts for number of drinks ordered and adds to table
    public void fountainDrink(int table [][], int tableNum) {
        System.out.println("\nEnter the amount of Fountain Drinks ordered");
        Scanner scanner = new Scanner(System.in);
        fountainDrink = scanner.nextInt();
        table[tableNum] [4] = fountainDrink;
        
        System.out.println("\nWhat type of soda?"
                + "\nCoke"
                + "\nPepsi"
                + "\nRoot Beer"
                + "\nSprite");
        popType = scanner.next();
        System.out.println("\nItem added to order!"); 
    } //close method 
    
} //close class
