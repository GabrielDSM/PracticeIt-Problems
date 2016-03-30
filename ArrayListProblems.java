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
}