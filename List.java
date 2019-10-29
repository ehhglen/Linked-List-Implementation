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

/**
 * 
 * @param givenPosition
 * @param newItem
 * @return True if addition was succcessful; false if not
 */

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

//*****************************************************************

/**
 * Removes an occurance of a given entry from the LinkedList
 * @param The entry that is to be removed
 * @return True if removal was successful; false if not
 */

   
   public boolean remove(T anEntry) { 
       result = false;
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

//*****************************************************************

/**
 * Removes all entries from the list
 */

   public void clear() {
       head = null;
       numberOfEntries = 0;
   } // End clear

//*****************************************************************

/**
 * Gets the current number of entries in list
 * @return The number of entries
 */

   public int getCurrentSize() {
       return numberOfEntries;

   } // End getCurrentSize

//*****************************************************************

/**
 * See if list is empty
 * @return True if empty; false if not
 */

   public boolean isEmpty() {
       if(numberOfEntries == 0) {
           return true;
       } // End if
       return false;
   } // End isEmpty

//*****************************************************************

/**
 *  Counts the number of times a given entry appears in this collection
 * 
 * @param anEntry The entry that is to be counted 
 * @return The number of times anEntry is in the collection
 */

   public int getFrequencyOf(T anEntry) {
       Node<T> currentNode = new Node<T> (anEntry);
       int listCount = 0;

       for(int i = 0; i <= numberOfEntries; i++) {
           if(anEntry.equals(currentNode.getData()))
           {
               listCount++;
           }
           currentNode = currentNode.getNextNode();
       }
       return listCount;

   } // End getFrequencyOf

   //*****************************************************************

   public boolean contains(T anEntry) {
       result = false;
       Node<T> currentNode = head;

       while(!result && (currentNode != null)) {
           if(anEntry.equals(currentNode.getData()))
           {
               result = true;
           } else {
               currentNode.currentNode.getNextNode();
           }
       } // End while loop
       return result;

   } // End contains method 

} // End class 