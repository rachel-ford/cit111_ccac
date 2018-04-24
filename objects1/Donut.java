
package objects1;

public class Donut {
    
    //member variables
    private double percRemaining = 100;
    public String name;
    private double sugar = 25;
    private double fat = 15;
    private double calories = 297;
    
    //calculate nutrition information based on bitesize(s)
    public void simulateEating(double percentEaten) {
        //subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - (percentEaten * 10);
        sugar = sugar * percentEaten;
        fat = fat * percentEaten;
        calories = calories * percentEaten;
    } //close method
    
    //method takes no input parameters and returns percRemaining
    public double getPercRemaining() {
        //very simple guts; just send back the value of one of the object's
        //member variables to the calling method. this is called a "getter"
        return percRemaining;
    } //close method
    
    //there's no main() method in this class!
    //we must make this object with the new keyword inside another class
    //in order for this class to do anything
  
    public double displaySugar() {
        return sugar;
    }//close method
    
    public double displayFat() {
        return fat;
    }//close method
    
    public double displayCalories() {
        return calories;
    }//close method
        
    public void donutReset() {
        sugar = 25;
        fat = 15;
        calories = 297;
    }
    
} //close class
