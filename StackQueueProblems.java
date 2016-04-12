// Gabriel Menescal
// This file contains various solutions to StackQueue practice-it problems

public class StackQueueProblems {
   public void compressDuplicates(Stack<Integer> s) {
      if (s.size() == 0) {
         boolean parity = false;
         Queue<Integer> q = LinkedList<Integer>();
         for (int i = 0; i < s.size(); i++) {
            int curr = q.remove();
            int repetition = 1;
            int previous;
            if (curr == previous) {
               repetition++;
               parity = true;
            }
         }
      }
   }
   
   // A method that takes a stack of integers as a parameter and splits it into negatives and non-negatives. 
   // The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack 
   // and all the non-negatives appear on the top. You may use a single queue as auxiliary storage.
   // E.g. bottom [5, -10, 15, 0, -5, 100] top --> Output: [-5, -10, 100, 0, 15, 5]
   public void splitStack(Stack<Integer> s) {
      Queue<Integer> q = new LinkedList<Integer>();
      int size = s.size();
      while (!s.isEmpty()) {
         q.add(s.pop());
      }
      for (int i = 0; i < size; i++) {
         int n = q.remove();
         if (n < 0) {
            s.push(n);
         } else {
            q.add(n);
         }
      }
      while (!q.isEmpty()) {
         s.push(q.remove());
      }
   }
   
   // A method that takes a stack of integers as a parameter and replaces every value in the stack with two occurrences 
   // of that value. E.g. bottom [3, 7, 1, 14, 9] top --> Output: [3, 3, 7, 7, 1, 1, 14, 14, 9, 9]
   public void stutter(Stack<Integer> s) {
      Queue<Integer> q = new LinkedList<Integer>();
      while (!s.isEmpty()) {
         q.add(s.pop());
      }
      while (!q.isEmpty()) {
         s.push(q.remove());
      }
      while (!s.isEmpty()) {
         q.add(s.pop());
      }
      while (!q.isEmpty()) {
         s.push(s.push(q.remove()));
      }
   }
}