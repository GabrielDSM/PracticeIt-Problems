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
   
   // A method hat takes a stack of integers as a parameter and returns a copy of the original stack (i.e., a new stack 
   // with the same values as the original, stored in the same order as the original). Your method should create the 
   // new stack and fill it up with the same values that are stored in the original stack. It is not acceptable to return 
   // the same stack passed to the method; you must create, fill, and return a new stack. The original stack must be restored 
   // to its original state and you will return the new independent stack that is in the same state. You may use one queue as 
   // auxiliary storage. E.g. bottom [3, 7, 1, 14, 9] top --> Output: Stack returned [3, 7, 1, 14, 9]/Orginial Stack [3, 7, 1, 14, 9]
   public Stack<Integer> copyStack(Stack<Integer> s) {
      Queue<Integer> q = new LinkedList<Integer>();
      Stack<Integer> result = new Stack<Integer>();
      int size = s.size();
      while (!s.isEmpty()) {
         q.add(s.pop());
      }
      while (!q.isEmpty()) {
         s.push(q.remove());
      }
      while (!s.isEmpty()) {
         int n = s.pop();
         q.add(n);
         q.add(n);
      }
      for (int i = 0; i < size; i++) {
         result.push(q.remove());
         q.add(q.remove());
      }
      while (!q.isEmpty()) {
         s.push(q.remove());
      }
      return result;
   }
   
   // A method that takes as parameters two stacks of integers and returns true if the two stacks
   // are equal and that returns false otherwise. To be considered equal, the two stacks would 
   // have to store the same sequence of integer values in the same order. Your method is to 
   // examine the two stacks but must return them to their original state before terminating. You
   // may use one stack as auxiliary storage.
   public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
      Stack<Integer> temp = new Stack<Integer>();
      if (s1.size() != s2.size()) {
         return false;
      }
      int size = s1.size();
      boolean result = true;
      while (result && !s1.isEmpty()) {
         int n1 = s1.pop();
         int n2 = s2.pop();
         temp.push(n1);
         temp.push(n2);
         if (n1 != n2) {
            result = false;
         }
      }
      while (!temp.isEmpty()) {
         s2.push(temp.pop());
         s1.push(temp.pop());
      }
      return result;
   }
}