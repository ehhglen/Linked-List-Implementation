public abstract class List implements MyCollectionInterface {

    // Declare variables

    Node head;
    int numberOfEntries;


   public boolean add(T newItem) {
       Node newNode;
       newNode.setData = newItem;

       try {
           if(numberOfEntries == 0) {
               firstNode = newNode;
           } // End if
           else {
               newNode.setNextNode = firstNode;
               firstNode = newNode;
           }
       } // End try

       catch(Exception e) {
           System.err.println("Unable to add item to the list.");
       }
       
   } // End add

   public T remove() {

   } // End remove

} // End class 