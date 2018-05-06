
package objects2_creatures;

public class SizedDonut {
    
    //member variables
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten) {
        percRemaining = percRemaining - percentEaten;
        System.out.println("SizedDonut.simulateEating | Perc Rem: " + percRemaining);
        
    } //close method
    
    public int getPercRemaining() {
        return percRemaining;
    } //close method
   
    
} //close class
