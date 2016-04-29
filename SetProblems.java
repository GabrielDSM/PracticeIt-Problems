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
   
   public int numInCommon(List<Integer> l1, List<Integer> l2) {
      Set<Integer> s1 = new HashSet<Integer>();
      Set<Integer> s2 = new HashSet<Integer>();
      int common = 0;
      for (int n : l1) {
         s1.add(n);
      }
      for (int n : l2) {
         s2.add(n);
      }
      for (int n : s1) {
         if (s2.contains(n)) {
            common++;
         }
      }
      return common;
   }
}
