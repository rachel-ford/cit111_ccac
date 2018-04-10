/*
 *Allows user to place food orders, check order status, replenish inventory, and checkout. 
 *Items ordered are calculated for checkout, and reset after checkout.
 *Replenishment adds number of items ordered to variables to allow the preparation of food. 
 *System alerts user when stock is running low. 
 *author @Rachel Ford
 */
package weekB1_scope;

import java.util.Scanner;
import java.util.Random;

public class PeppHut {
    
//declare and intialize member variables
    private static int pizzaOrder = 0;
    private static int saladOrder = 0;
    private static int sandOrder = 0;
    private static int garlicOrder = 0;
    private static int toppingOrder =0;
    
    private static int pizzaTotal =0;
    private static int saladTotal =0;
    private static int sandTotal =0;
    private static int garlicTotal =0;
    
    private final static double pizzaPrice = 12.99;
    private final static double saladPrice = 9.99;
    private final static double sandPrice = 6.99;
    private final static double toppingPrice = 1.25;
    private final static double garlicPrice = 5.99;
    private final static double tax = 0.07;
    
    private static int cheese = 50;
    private static int sauce = 25;
    private static int pepperoni = 15;
    private static int mushroom = 5;
    private static int sausage = 8;
    private static int crust = 25;
    
    private static int lettuce = 10;
    private static int crouton = 5;
    private static int dressing = 5;
    
    private static int buns = 9;
    private static int chicken = 3; 
    private static int fish = 3;
    private static int steak = 3;
    
    private static int bread = 8; 
    private static int garlic = 8;
    private static int butter = 8;
    
public static void main(String args[]) {
    
    System.out.println("  Welcome To Pepperoni Hut!");
    System.out.println("******************************");
    menu();
    
    //call upon Scanner
    int userOp;
    Scanner scanner = new Scanner(System.in);
    
    //switch for main user option menu
    do {
    userOp = scanner.nextInt();
        
        switch (userOp) {
            
            case 1: 
                placeOrder();
                break;
            case 2:
                orderStatus();
                break;
            case 3:
                replenish();
                break;
            case 4:
                checkout();
                break;
            case 5:
                break;
        } //close switch
    } while(userOp < 5);
} //close main
    
//method allows the user to place pizza order
public static void pizza() {
    
    System.out.println("\nEnter the nubmer of pizza ordered");
    
    Scanner scanner = new Scanner(System.in);
    
    //subtracts ingredients from inventory
    pizzaOrder = scanner.nextInt(); 
    cheese = cheese - (pizzaOrder * 2);
    sauce = sauce - pizzaOrder; 
    crust = crust - pizzaOrder;
    
    //prompts user for topping choice
    System.out.println("\nAny toppings?"
            + "  \nPepperoni"
            + "  \nMushroom"
            + "  \nSausage");
    String topChoice = scanner.next();
    
    //ifs subtract ingredients from inventory based upon user selection
    if(topChoice.equals("Pepperoni")) {
        pepperoni = pepperoni - pizzaOrder;
        toppingOrder++;
    } //close if
    
    if(topChoice.equals("Mushroom")) {
        mushroom = mushroom - pizzaOrder;
        toppingOrder++;
    } //close if
    
    if(topChoice.equals("Sausage")) {
        sausage = sausage - pizzaOrder;
        toppingOrder++;
    } //close if
    
    System.out.println("Order Placed!\n");
    System.out.println("To place another order press the corresponding letter in []");
    System.out.println("****************************************************");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[d] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[f] Finish Order");
} //close pizza
    
//method allows the user to place a salad order
public static void salad() {
    System.out.println("\nEnter the nubmer of salads ordered");
    
    Scanner scanner = new Scanner(System.in);
    
    //subtract ingredients from inventory
    saladOrder = scanner.nextInt();
    lettuce = lettuce- saladOrder - 2;
    crouton = crouton - saladOrder;
    dressing = dressing - saladOrder;
    cheese = cheese - saladOrder;
    
    System.out.println("Order Placed!\n");
    System.out.println("To place another order press the corresponding letter in []");
    System.out.println("****************************************************");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[d] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[f] Finish Order");
}
 
//allows the user to place a sandwich order
public static void sandwhich() {
    System.out.println("\nEnter the nubmer of sandwiches ordered");
    
    Scanner scanner = new Scanner(System.in);
    
    //subtracts ingredients from inventory
    sandOrder = scanner.nextInt();
    buns = buns - sandOrder;
    lettuce = lettuce - sandOrder;
    cheese = cheese - sandOrder;
    
    //promts user for meat selection
    System.out.println("\nType of Sandwich meat:"
            + "  \nChicken"
            + "  \nFish"
            + "  \nSteak");
    String topChoice = scanner.next();
    
    //subtracts ingredients from inventory based upon user selection
    if(topChoice.equals("Chicken")) {
        chicken = chicken - sandOrder;
    } //close if
    
    if(topChoice.equals("Fish")) {
        fish = fish - sandOrder;
    } //close if
    
    if(topChoice.equals("Steak")) {
        steak = steak - sandOrder;
    } //close if
    System.out.println("Order Placed!\n");
    System.out.println("To place another order press the corresponding letter in []");
    System.out.println("****************************************************");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[d] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[f] Finish Order");
} //close sandwhich

//method allows the user to place a garlic bread order
public static void garlicBread() {
    System.out.println("\nEnter the nubmer of garlic bread ordered");
    
    Scanner scanner = new Scanner(System.in);
    
    //subtracts ingredients from inventory
    garlicOrder = scanner.nextInt();
    bread = bread - garlicOrder;
    garlic = garlic - garlicOrder;
    butter = butter - garlicOrder;
   
    System.out.println("Order Placed!\n");
    System.out.println("To place another order press the corresponding letter in []");
    System.out.println("****************************************************");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[d] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[f] Finish Order");
} //close garlicBread

//method displays the main switch menu
public static void menu() {
    System.out.println("Select the option corresponding to the attached number");
    System.out.println("1: Place Order");
    System.out.println("2: Check Order Status");
    System.out.println("3: Replenish Stock");
    System.out.println("4: Checkout");
    System.out.println("5: Exit");
} //close menu

//method allows the user to place an order
public static void placeOrder() {
    System.out.println("\nTo place order press the corresponding letter in []");
    System.out.println("****************************************************");
    System.out.println("[p] Pizza");
    System.out.println("[s] Salad");
    System.out.println("[d] Sandwhich");
    System.out.println("[g] Garlic Sticks");
    System.out.println("[f] Finish Order");
    
    Scanner scanner = new Scanner(System.in);
    int userOp = 0;
    String userInput;
    
    //switch between food menu options
    do {
        userInput = scanner.next();
        
        switch(userInput) {
            case "p": 
                pizza();
                break;
                
            case "s":
                salad();
                break;
                
            case "d":
                sandwhich();
                break;
                
            case "g":
                garlicBread();
                break;
           
            case "f":
                userOp = 1;
                menu();
                System.out.println("\n");
                break;
        } //close switch
    
    // ifs display when inventory runs low on specific items & promts user to place a replenishment order
    if(cheese <= 5) {
    System.out.println("\nRunning low on cheese! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(sauce <= 5) {
        System.out.println("Running low on pizza sauce! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(pepperoni <= 2) {
        System.out.println("Running low on pepperoni! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(sausage <= 2) {
        System.out.println("Running low on sausage! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(mushroom <= 2) {
        System.out.println("Running low on mushroom! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(crust <= 5) {
        System.out.println("Running low on pizza dough! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(lettuce <= 4) {
        System.out.println("Running low on lettuce! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(crouton <= 2) {
        System.out.println("Running low on croutons! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(dressing <= 2) {
        System.out.println("Running low on salad dressing! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(buns <= 2) {
        System.out.println("Running low on sandwich buns! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(chicken <= 2) {
        System.out.println("Running low on chicken! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(steak <= 2) {
        System.out.println("Running low on steak! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(fish <= 2) {
        System.out.println("Running low on fish! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(bread <= 3) {
        System.out.println("Running low on bread! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(garlic <= 3) {
        System.out.println("Running low on garlic! Place an order for more in the Replenishment section.\n");
    } //close if
    
    if(butter <= 3) {
        System.out.println("Running low on butter! Place an order for more in the Replenishment section.\n");
    } //close if
    
    } while(userOp < 1);
} //close placeOrder

//method displays a random orderstatus
public static void orderStatus() {
    
    Random randGenerator = new Random();
    int randNum = randGenerator.nextInt();
    
    if(randNum >= 5 ) {
        System.out.println("\nAlmost ready!");
    } //close if
    
    if(randNum < 5 ) {
        System.out.println("\nNot quite yet - Check back in a few.");
    } //close if
    
    if (randNum > 10) {
        System.out.println("Order up!");
    } //close if
    
    System.out.println("\nSelect the option corresponding to the attached number");
    System.out.println("1: Place Order");
    System.out.println("2: Check Order Status");
    System.out.println("3: Replenish Stock");
    System.out.println("4: Checkout");
    System.out.println("5: Exit");
} //close orderStatus

//method allows the user to replenish the the items in inventory
public static void replenish() {
    
//loop to continue ordering items to replenish inventory
    String userInput;
do {
    System.out.println("\nType which item you wish to replenish. Note: items are case sensitive."
            + "\nCheese"
            + "\nSauce"
            + "\nPepperoni"
            + "\nMushroom"
            + "\nSausage"
            + "\nDough"
            + "\nLettuce"
            + "\nCroutons"
            + "\nDressing"
            + "\nBuns"
            + "\nChicken"
            + "\nFish"
            + "\nSteak"
            + "\nBread"
            + "\nGarlic"
            + "\nButter"
            + "\nTo exit press e");
    
    Scanner scanner = new Scanner(System.in);
    userInput = scanner.next();
    
    //ifs prompt user on how much of the selected item they wish to order & adds the amount to the inventory totals
    if(userInput.equals("Cheese")) {
    System.out.println("\nHow much cheese would you like to order?\n");
    int iNum = scanner.nextInt();
    cheese =+ iNum;
    } //close if
    
    if(userInput.equals("Sauce")) {
        System.out.println("\nHow much sauce would you like to order?\n");
        int iNum = scanner.nextInt();
        sauce =+ iNum;
    } //close if
    
    if(userInput.equals("Pepperoni")) {
        System.out.println("\nHow much pepperoni would you like to order?\n");
        int iNum = scanner.nextInt();
        pepperoni =+ iNum;
    } //close if
    
    if(userInput.equals("Sausage")) {
        System.out.println("\nHow much sausage would you like to order?\n");
        int iNum = scanner.nextInt();
        sausage =+ iNum;
    } //close if
    
    if(userInput.equals("Mushroom")) {
        System.out.println("\nHow much mushrooms would you like to order?\n");
        int iNum = scanner.nextInt();
        mushroom =+ iNum;
    } //close if
    
    if(userInput.equals("Crut")) {
        System.out.println("\nHow much pizza dough would you like to order?\n");
        int iNum = scanner.nextInt();
        crust =+ iNum;
    } //close if
    
    if(userInput.equals("Lettuce")) {
        System.out.println("\nHow much lettuce would you like to order?\n");
        int iNum = scanner.nextInt();
        lettuce =+ iNum;
    } //close if
    
    if(userInput.equals("Croutons")) {
        System.out.println("\nHow many croutons would you like to order?\n");
        int iNum = scanner.nextInt();
        crouton =+ iNum;
    } //close if
    
    if(userInput.equals("Dressing")) {
        System.out.println("\nHow much dressing would you like to order?\n");
        int iNum = scanner.nextInt();
        dressing =+ iNum;
    } //close if
    
    if(userInput.equals("Buns")) {
        System.out.println("\nHow many sandwich buns would you like to order?\n");
        int iNum = scanner.nextInt();
        buns =+ iNum;
    } //close if
    
    if(userInput.equals("Chicken")) {
        System.out.println("\nHow much chicken would you like to order?\n");
        int iNum = scanner.nextInt();
        chicken =+ iNum;
    } //close if
    
    if(userInput.equals("Steak")) {
        System.out.println("\nHow much steak would you like to order?\n");
        int iNum = scanner.nextInt();
        steak =+ iNum;
    } //close if
    
    if(userInput.equals("Fish")) {
        System.out.println("\nHow much fish would you like to order?\n");
        int iNum = scanner.nextInt();
        fish =+ iNum;
    } //close if
    
    if(userInput.equals("Bread")) {
        System.out.println("\nHow much bread would you like to order?\n");
        int iNum = scanner.nextInt();
        bread =+ iNum;
    } //close if
    
    if(userInput.equals("Garlic")) {
        System.out.println("\nHow much garlic would you like to order?\n");
        int iNum = scanner.nextInt();
        garlic =+ iNum;
    } //close if
    
    if(userInput.equals("Butter")) {
        System.out.println("\nHow much butter would you like to order?\n");
        int iNum = scanner.nextInt();
        butter =+ iNum;
    } //close if
    
    System.out.println("\nItems ordered for replenishment.\n");
} while(!userInput.equals("e"));

    //displays menu
    System.out.println("Select the option corresponding to the attached number");
    System.out.println("1: Place Order");
    System.out.println("2: Check Order Status");
    System.out.println("3: Replenish Stock");
    System.out.println("4: Checkout");
    System.out.println("5: Exit");
    
} //close replenish

//method displays receipt based upon items ordered in method placeOrder()
public static void checkout() {
    System.out.println("\nReceipt");
    System.out.println("*************");
    
    //ifs break down amount due based upon individual items ordered
    if(pizzaOrder >= 1) {
        pizzaTotal = (int) ((pizzaOrder * pizzaPrice) + (toppingPrice * toppingOrder));
        System.out.println("Pizza: $" + pizzaTotal);
        
        //displays price of toppings if toppings are ordered
        if (toppingOrder >= 1) {
            System.out.println("Toppings: $" + (toppingPrice * toppingOrder));
        }
    } //close if
    
    if(sandOrder >= 1) {
        sandTotal = (int) (sandOrder * sandPrice);
        System.out.println("Sandwhich: $" + sandTotal);
    } //close if
    
    if(saladOrder >= 1) {
        saladTotal = (int) (saladOrder * saladPrice);
        System.out.println("Salad: $" + saladTotal);
    } //close if
    
    if(garlicOrder >= 1) {
        garlicTotal = (int) (garlicPrice * garlicOrder);
        System.out.println("Garlic Bread: $" + garlicTotal);
    } //close if
    
    //calculates total price, sales tax, and grand total due. 
    double grandTotal = pizzaTotal + sandTotal + saladTotal + garlicTotal;
    System.out.println("\nTotal: $" + grandTotal);
    double orderTax = tax * grandTotal;
    System.out.println("Tax: $" + orderTax);
    grandTotal = grandTotal + orderTax;
    System.out.println("Grand Total: $" + grandTotal);
    
    //set variables back to zero to prepare for another order
    pizzaOrder = 0;
    pizzaTotal = 0;
    toppingOrder = 0;
    saladOrder = 0;
    saladTotal = 0;
    sandOrder = 0;
    sandTotal = 0;
    garlicOrder = 0;
    garlicTotal = 0;
    grandTotal = 0;
    orderTax = 0;
    
    System.out.println("\nSelect the number corresponding to the attached number");
    System.out.println("1: Place Order");
    System.out.println("2: Check Order Status");
    System.out.println("3: Replenish Stock");
    System.out.println("4: Checkout");
    System.out.println("5: Exit");
    
} //close checkout

} //close class
