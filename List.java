public abstract class List implements MyCollectionInterface<T> {

    // Declare variables

    private Node head;
    private Node firstNode;
    private int numberOfEntries;

    @Override
   public boolean add(T newItem) {
       if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1)) {
           Node newNode = new Node(newItem);
           if(givenPosition == 1) { // Adding to beginning of chain
               newNode.setNextNode(firstNode);
               firstNode = newNode;
           } // End inner if
           else {                   // Adding to position not beginning of chain
               Node nodeBefore = getNodeAt(givenPosition - 1);
               Node nodeAfter= nodeBefore.getNextNode();
               newNode.setNextNode(nodeAfter);
               nodeBefoere.setNextNode(newNode);
           } // End else
       } // End if
       numberOfEntries++;
      
      
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
       firstNode = null;
       numberOfEntries = 0;
   } // End clear

   public int getCurrentSize() {
       return numberOfEntries;

   } // End getCurrentSize

   public boolean isEmpty() {
       if(numberOfEntries == 0) {
           return true;
       } // End if
       return false;
   } // End isEmpty

} // End class 