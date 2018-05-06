
package objects2_creatures;

public class Creatureland {
    public static void main(String args []) {
        
        Creature penguin = new Creature();
        
        //writing member variable values
        penguin.name = "Anna";
        penguin.species = "Emporer Penquin";
        penguin.minBiteSize = 50;
        penguin.setBiteSizeInPercent(23);
        
        //display creature stats
        displayCreatureStats(penguin);
        
        //create first SizedDonut
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Bobert";
        donutForPenguin.sizeInmm = 32;
        
        //create second sizedDonut 
        SizedDonut donutDean = new SizedDonut();
        donutDean.name = "Dean";
        donutDean.sizeInmm = 134;

        displaySizedDonutStats(donutForPenguin);
        displayDonutDeanStats(donutDean);
        
        //pass an instance of a SizedDonut object into the eatDonut method
        penguin.eatDonut(donutForPenguin, donutDean);
        
        //display donut stats
        displaySizedDonutStats(donutForPenguin);
        displayDonutDeanStats(donutDean);
        
    } //close main 
    
    public static void displayCreatureStats(Creature penguin) {
        System.out.println("***Creature Stats***");
        System.out.println("Creature Name: " + penguin.name);
        System.out.println("Species: " + penguin.species);
        System.out.println("Bite Size: " + penguin.getBiteSizeInPercent() + "% of a SizedDonut");
        System.out.println("Min SizedDonut size: " + penguin.minBiteSize + "mm");
        System.out.println("***********************");
    } //close method
    
    public static void displaySizedDonutStats(SizedDonut donutForPenguin) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutForPenguin.name);
        System.out.println("Size: " + donutForPenguin.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutForPenguin.getPercRemaining() + "%");
        System.out.println("***********************");
    } //close method
    
    public static void displayDonutDeanStats(SizedDonut donutDean) {
        System.out.println("***SizedDonut Stats***");
        System.out.println("Name: " + donutDean.name);
        System.out.println("Size: " + donutDean.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutDean.getPercRemaining() + "%");
        System.out.println("***********************");
    }
    
} //close  class
