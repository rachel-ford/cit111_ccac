
package objects1;

public class Cookie {
   
    //member variables
    double percRemaining = 100;
    private double sugar = 11;
    private double fat = 7;
    private double calories = 160;
    
    //calculate nutrition information based on bitesize(s)
    public void eatCookie (double percEaten) {
        percRemaining = percRemaining - (percEaten * 10);
        sugar = sugar * percEaten;
        fat = fat * percEaten;
        calories = calories * percEaten;
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
    
    public void cookieReset() {
        sugar = 11;
        fat = 7; 
        calories = 160;
    }
} //close class
