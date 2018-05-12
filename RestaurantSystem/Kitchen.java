
package RestaurantSystem;

public class Kitchen extends Order{

    //member variables for ingredients 
    int cheese = 50; 
    int sauce = 25; 
    int pepperoni = 15; 
    int mushroom = 5; 
    int sausage = 8; 
    int crust = 25; 
    int lettuce = 10;
    int crouton = 5;
    int dressing = 5;
    int buns = 9;
    int chicken = 3;
    int fish = 3;
    int steak = 3;
    int bread = 8;
    int garlic = 8;
    int butter = 8;
    int coke = 50;
    int pepsi = 50;
    int rootBeer = 50;
    int sprite = 50;
    int toppingNumber; 
    static String name;
    
    //calls methods to make food 
    public void orderLine(int pizza, int salad, int sandwhich, int garlicBread, int fountainDrink, String toppingChoice, String popType, String meat) {
        makePizza(pizza, toppingChoice);
        makeSalad(salad);
        makeSandwhich(sandwhich, meat);
        makeGarlicBread(garlicBread);
        makeFountainDrink(fountainDrink, popType);
    } //close method
    
    //simulates making pizza & subtracts ingredients from quantitiy on hand
    public void makePizza(int pizza, String toppingChoice) { 
        if (pizza > 0) {
            super.pizza = pizza; 
            cheese -= (pizza * 2);
            sauce -= pizza; 
            crust -= pizza;
        
        super.toppingChoice = toppingChoice;
        if (toppingChoice.equals("Pepperoni")) {
            pepperoni -= pizza;
            toppingNumber++;
        } //close if
        
        if (toppingChoice.equals("Mushroom")) {
            mushroom -= pizza; 
            toppingNumber++;
            System.out.println(toppingNumber);
        } //close if 
            
        if (toppingChoice.equals("Sausage")) {
            sausage -= pizza; 
            toppingNumber++;
        } //close if 
        
        //creates pizza to be delivered to customer
        Kitchen pizzaToEat = new Kitchen();
        pizzaToEat.name = "Pizza";
            System.out.println("\nOrder up! " + pizzaToEat.name + " made.");
        LowAlert();
    } //close if
    } //close method
    
    //simulates making salad & subtracts ingredients from quantity on hand
    public void makeSalad(int salad) {
        if(salad > 0 ){
            lettuce -= (salad * 2);
            crouton -= salad;
            dressing -= salad; 
            cheese -= salad; 
            
            //creates salad to be delivered to customer
            Kitchen saladToEat = new Kitchen();
            saladToEat.name = "Salad";
            System.out.println("\nOrder up! " + saladToEat.name + " made.");
            LowAlert();
        } //close if
    } //close method 
    
    //simulates making a sandwhich & subtracts quantity on hand 
    public void makeSandwhich(int sandwhich, String meat) {
        super.sandwhich = sandwhich;
        
        //creates sandwhich to be delivered to customer
        Kitchen sandwhichToEat = new Kitchen();
        if(sandwhich > 0) {
            buns -= sandwhich;
            lettuce -= sandwhich;
            cheese -= sandwhich; 
        
            super.meat = meat; 
            if("Chicken".equals(meat)) {
                chicken -= sandwhich;
                sandwhichToEat.name = "Chicken sandwhich";
                System.out.println(sandwhichToEat.name);
            } //close if 

            if("Fish".equals(meat)) {
                fish -= sandwhich;
                sandwhichToEat.name = "Fish sandwhich";
            } //close if 

            if("Steak".equals(meat)) {
                steak -= sandwhich;
                sandwhichToEat.name = "Steak sandwhich";
            } //close if 
            System.out.println("\nOrder up! Sanwhich made.");
            LowAlert();
        } //close if
    } //close method 
    
    //simulates making a garlic bread & subtracts quantity on hand 
    public void makeGarlicBread(int garlicBread) {
        super.garlicBread = garlicBread;
        if(garlicBread > 0) {
            bread -= garlicBread;
            garlic -= garlicBread; 
            butter -= garlicBread; 
            
            //creates garlic bread to be delivered to customer
            Kitchen garlicBreadToEat = new Kitchen();
            garlicBreadToEat.name = "Garlic Bread";
            System.out.println("\nOrder up! " + garlicBreadToEat.name + " made.");
            LowAlert();
        } //close if
    } //close method 
    
    //simulates making a fountain drink & subtracts quantity on hand 
    public void makeFountainDrink(int fountainDrink, String popType) {
        super.fountainDrink = fountainDrink;
        
        //creates drink to be delivered to customer
        Kitchen fountainDrinkToEat = new Kitchen();
        if(fountainDrink > 0) {
            super.popType = popType; 
            if("Coke".equals(popType)) {
                coke -= fountainDrink;
                fountainDrinkToEat.name = "Coke";
            } //close if 
            
            if("Pepsi".equals(popType)) {
                pepsi -= fountainDrink;
                fountainDrinkToEat.name = "Pepsi";
            } //close if 
            
            if("Root Beer".equals(popType)) {
                rootBeer -= fountainDrink;
                fountainDrinkToEat.name = "Root Beer";
            } //close if
            
            if("Sprite".equals(popType)) {
                sprite -= fountainDrink;
                fountainDrinkToEat.name = "Sprite";
            } //close if 
        
            System.out.println("\nOrder up! Fountain drink made.");
            LowAlert();
        } //close if
    } //close method 
    
    //alerts employee when ingredients quantities are below mininmum number to continue making food
    public void LowAlert () {
    
        
        int ingredients [] = { cheese, sauce, pepperoni, mushroom, sausage, crust,
            lettuce, crouton, dressing, buns, chicken, fish, steak, 
            bread, garlic, butter, coke, pepsi, rootBeer, sprite }; 
        int min = 2;  

        String itemName [] = { "cheese", "sauce", "pepperoni", "mushroom", "sausage", "crust",
                "lettuce", "crouton", "dressing", "buns", "chicken", "fish", "steak", 
                "bread", "garlic", "butter", "coke", "pepsi", "rootBeer", "sprite" };
        
        for(int i = 0; i < 20; i++) {
           if (ingredients[i] <= min ) {
               System.out.println("Running low on " + itemName[i] + "!\n");
           } //close if 
        } //close for
    } //close method 
    
} //close class 
