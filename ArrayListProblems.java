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
   
   // A method that takes an ArrayList of Strings as a parameter and that replaces every string with two 
   // of that string. E.g. ["how", "are", "you?"] --> Output: how, how, are, are, you?, you?]
   public void doubleList(ArrayList<String> list) {
      for(int i = list.size() - 1; i >= 0; i--) {
         list.add(i, list.get(i));
      }
   }
   
   // A method hat takes an ArrayList of integers as a parameter and that moves the minimum value in the list 
   // to the front, otherwise preserving the order of the elements. E.g. [6, 1, 4, -2] --> Output: [-2, 6, 1, 4]
   public void minToFront(ArrayList<Integer> list) {
      int min;
      if (list.size() > 0) {
         min = list.get(0);
         int index = 0;
         for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
               min = list.get(i);
               index = i;
            }
         }
         for (int i = index; i > 0; i--) {
            list.set(i,list.get(i - 1));
         }
         list.set(0,min);
      }
   }
   
   // A method that takes as a parameter a sorted ArrayList of Strings and that eliminates any duplicates from the list.
   // E.g. ["be", "be", "is", "not", "or", "question", "that", "the", "to", "to"] --> Output: [be, is, not, or, question, that, the, to]
   public void removeDuplicates(ArrayList<String> list) {
      for (int i = 0; i < list.size(); i++) {
         for (int j = list.size() - 1; j > i; j--) {
            if (list.get(i) == list.get(j)) {
               list.remove(j);
            }
         }
      }
   }
   
   // A method that takes an ArrayList of Strings and an integer k as parameters and that replaces every string with k copies of 
   // that string. For example, if the list stores the values ["how", "are", "you?"] before the method is called and k is 3, it 
   // should store the values ["how", "how", "how", "are", "are", "are", "you?", "you?", "you?"] after the method finishes executing. 
   // If k is 0 or negative, the list should be empty after the call.
   public void stutter(ArrayList<String> list, int k) {
      if(k <= 0) {
         list.clear();
      } else {
         for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 1; j < k; j++) {
               list.add(i, list.get(i));
            }
         }
      }
   }
   
   // A method that accepts four parameters: an ArrayList of integers, an element value, a starting index, and an ending index. 
   // The method's behavior is to remove all occurrences of the given element that appear in the list between the starting index 
   // (inclusive) and the ending index (exclusive). Other values and occurrences of the given value that appear outside the given 
   // index range are not affected. E.g. [1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 10], 9, 8, 11 --> Output: [1, 2, 3, 4, 5, 6, 7, 8, 10]
   public void removeInRange(ArrayList<Integer> list, int value, int start, int end) {
      for (int i = end - 1; i >= start; i--) {
         if (list.get(i) == value) {
            list.remove(i);
         }
      }
   }
}