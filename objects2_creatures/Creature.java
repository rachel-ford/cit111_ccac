
package objects2_creatures;

public class Creature {
    //public member variables 
    public String name;
    public String species;
    public int minBiteSize;
    //private member variable
    private int biteSizeInPercent;
    
    //Method to simulate eating donut
    public void eatDonut(SizedDonut donutForPenguin, SizedDonut donutDean) {
        //call the simulate eating method on donut
        if(donutForPenguin.sizeInmm > minBiteSize) {
        System.out.println("Creature.eatDonut | Eating 10% of " + donutForPenguin.name);
        donutForPenguin.simulateEating(biteSizeInPercent);
        } else { 
            System.out.println("Creature.eatDonut | SizedDonut TOO SMALL!");
        }
        
        if(donutDean.sizeInmm > minBiteSize) {
            System.out.println("Creature.eatDonut | Eating 10% of " + donutDean.name);
            donutDean.simulateEating(biteSizeInPercent);
        } else {
            System.out.println("Creature.eatDonut | SizedDonut TOO SMALL!");
        }
    }
    
    //getter method for biteSizeInPercent
    public int getBiteSizeInPercent() {
        return biteSizeInPercent;
    }
    
    //setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet) {
        if(sizeToSet > 0) {
            this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("SizedDonut.setBiteSizeInPercent | "
                    + "Ooops, negative values not allowed!");
        } //close if
    } //close method
    
} //close class
