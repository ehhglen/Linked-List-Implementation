public abstract class List implements MyCollectionInterface<T> {

    // Declare variables

    private Node head;
    private Node firstNode;
    private int numberOfEntries;

    @Override
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

   @Override
   public boolean remove() { // Why is the return type incompatible?
       // Store head node
       Node temp = head;
       //If head needs to be removed
       if(numberOfEntries == 0) 
       {
          temp.setNextNode(head);
          return true;
       }
       return false;


   } // End remove

   @Override
   public void clear() {
       head.setNextNode(null);

   } // End clear

   public int getCurrentSize() {

   } // End getCurrentSize

} // End class 