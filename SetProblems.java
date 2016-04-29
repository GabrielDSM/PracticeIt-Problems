// Gabriel Menescal
// This file contains various solutions to Set practice-it problems

public class SetProblems {
   public int numUnique (List<Integer> list) {
      Set<Integer> set = new HashSet<Integer>();
      for (int n : list) {
         set.add(n);
      }
      return set.size();
   }
}