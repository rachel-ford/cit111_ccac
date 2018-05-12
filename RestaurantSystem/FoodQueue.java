
package RestaurantSystem;

    /** queue interface places food objects into an array simulating a food order line. 
     *  When the objects are put onto the order line an alert is sent that the item is ready for pickup. 
     *  Alerts staff when the order queue is full and no more dishes can be placed on the line.
    **/
    interface IFoodQ {
        void put (Object kitchen);
        Object get ();
    } //close interface 
   
     public class FoodQueue implements IFoodQ {

           private final Object [] q; 
           private int putloc; 
           private int getloc;
           private final int max = 15;
           
           //Construct an empty queue given its size 
           public FoodQueue (int max) {
               q = new Object [max + 1]; 
               putloc = getloc = 0;
           } //close method 
           
           // put a food object into the queue
           public void put(Object kitchen) {
               System.out.println("\nOrder up! " + Kitchen.name + "is ready for pickup.");
                if ((putloc==q.length-1) & (getloc==0)) {
                    System.out.println("\n**Order queue is full!"
                            + "Please retrieve your food items.**");
                    return;
                } //close if 
                q[putloc++] = kitchen;
                if(putloc==q.length) putloc = 0; //loop back
           } //close put method 
           
           //get food object
           public Object get() {
               if(getloc == putloc) {
                   System.out.println("\n**Order queue is empty. No food items on the line.**");
                   return (Object) 0;
               } //close if
               
               Object kitchen = q[getloc++];
               if(getloc==q.length) getloc = 0; //loop back
               return kitchen;
           } //close get method
        } //close class 
        