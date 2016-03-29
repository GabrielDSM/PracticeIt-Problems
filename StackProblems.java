// Gabriel Menescal
// This file contains various solutions to Stack practice-it problems

public class StackProblems {
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
}