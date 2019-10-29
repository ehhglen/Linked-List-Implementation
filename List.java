public abstract class List implements MyCollectionInterface<T> {

    // Declare variables

    private Node head;
    private Node firstNode;
    private int numberOfEntries;
    private boolean result;

//*****************************************************************

/**
 * Adds a new entry to the LinkedList
 * @param newItem
 * @return True if successful; false if not
 */

   public boolean add(T newItem) {

        Node newNode = new Node(newItem);

        newNode.setNextNode = head;
        head = newNode;

        if(head.equals(newNode)) {
            numberOfEntries++;
        }
        return result; 
       
   } // End add

//*****************************************************************

public boolean add(int givenPosition, T newItem) {
    result = false;

    if((givenPosition >= 0) && (givenPosition <= numberOfEntries)) {

        Node<T> newNode = newNode<T> (newItem);

        if(givenPosition == 0) 
        {
            newNode.setNextNode = head;
            head = newNode;
            numberOfEntries++;
            add(newItem);
            result = true;
        } else {
            Node<T> currentNode = head;
            for(int i = 1; i < givenPosition; i++) 
            {
                currentNode = currentNode.next;
            } // End for loop

            newNode.next = currentNode.next;
            currentNode.next = newNode;
            numberOfEntries++;
        } // End else
    } else {
        throw new IndexOutOfBoundsException("The given position cannot be found.");
    } // End else
    return result;
} // End add method

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