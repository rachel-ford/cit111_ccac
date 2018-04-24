
package objects1;

public class Cupcake {
    
    //member variables 
    private double percRemaining = 100;
    private double sugar = 17;
    private double fat = 9;
    private double calories = 300;
    
    //calculate nutrition information based on bitesize(s)
    public void eatCake(double percEaten) {
        sugar = sugar * percEaten;
        fat = fat * percEaten;
        calories = calories * percEaten;
        percRemaining = percRemaining - (percEaten * 10);
    } //close method
    
    public double getPercRemaining() {
        return percRemaining;
    } //close method
    
    public double displaySugar() {
        return sugar;
    }//close method
    
    public double displayFat() {
        return fat;
    }//close method
    
    public double displayCalories() {
        return calories;
    }//close method
    
    public void cakeReset() {
        sugar = 17;
        fat = 9;
        calories = 300;
    }
    
} //close class
