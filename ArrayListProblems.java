// Gabriel Menescal
// This file contains various solutions to ArrayList practice-it problems

public class ArrayListProblems {
   
   // A method that takes an ArrayList of Strings as a parameter and that returns the length 
   // of the longest string in the list. E.g. ArrayList [] --> Output: 0 
   // ArrayList ["or", "not", "to", "be", "hamlet"] --> Output: 6
   public int maxLength(ArrayList<String> list) {
      int max = 0;
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).length() > max) {
            max = list.get(i).length();
         }
      }
      return max;
   }
   
   // A method that takes an ArrayList of Strings as a parameter and that removes all of the strings 
   // of even length from the list. E.g. ["even", "odd", "ev", "o"] --> Output: [odd, o]
   public void removeEvenLength(ArrayList<String> list) {
      for (int i = list.size() - 1; i >= 0; i--) {
         if (list.get(i).length() % 2 == 0) {
            list.remove(i);
         }
      }
   }
}