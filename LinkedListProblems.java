// Gabriel Menescal
// This file contains various solutions to LinkedList practice-it problems

public class LinkedListProblems {
   
   // A method that takes in an index and a value and resets the value of the node at the particular index.
   // Assume this method is inside the LinkedIntList class : 
   /**
    * public class LinkedIntList {
    *    private ListNode front;   // null for an empty list
    *    ...
    * }
    **/
   public void set(int index, int value) {
   ListNode curr = front;
   for (int i = 0; i < index; i++) {
      curr = curr.next;
   }
   curr.data = value;
   }
}
