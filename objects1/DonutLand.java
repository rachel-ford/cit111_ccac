
package objects1;

public class DonutLand {
    
    public static void main(String args[]) {
        final int firstBiteSize = 12;
        
        //create a "handle" variable that can store references to Donut objects
        Donut firstDonut;
        //create a new Donut (an instance of the Donut Class) and connect
        //this new object to our "handle" variable firstDonut
        firstDonut = new Donut();
        
        //access firstDonut's name property, which is type String, and 
        //store the name "Rachel" in this particular Donut object's memory bin
        firstDonut.name = "Rachel";
        
        //print a test of Rachel's member variable values
        System.out.println("When first created, " + firstDonut.name + "'s\n"
                + "percent remaining is " + firstDonut.getPercRemaining());
        //convenience method for printing a row of dots to the screen
        printDivider();
        
        System.out.println("Calling simulateEating and passing in\n" + 
                "a bite size of " + firstBiteSize);
        printDivider();
        
        //call a method simulateEating on our firstDonut object and pass
        //in the int variable firstBiteSize as a parameter
        firstDonut.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n"
                + "percent remaining is " + firstDonut.getPercRemaining());
    } //close main 
    
    private static void printDivider() {
        System.out.println("..............................................");
    }
} //close class
  