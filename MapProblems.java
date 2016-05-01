// Gabriel Menescal
// This file contains various solutions to Map practice-it problems

public class MapProblems {
   
   // A method that, takes a Map<String,String>, where the keys are song names mapping
   // to artists. The method returns a Map<String, Set<String>> where the string (artist names)
   // map to a Set<String> of all their songs.
   public Map<String, Set<String>> artists (Map<String, String> songs) {
      Map<String, Set<String>> result = new TreeMap<String, Set<String>>();
      for (String s : original.keySet()) {
         String artist = songs.get(s);
         if (!result.containsKey(artist)) {
            result.put(artist, new HashSet<Integer>());
         }
         result.get(artist).add(s);
      }
      return result;
   }
   
   // A method that takes a List<String> and, using a Map<String, Integer>, returns true whether
   // any single string occurs at least 3 times, otherwise returns false
   public boolean contains3(List<String> list) {
      Map<String, Integer> map = new HashSet<String, Integer>();
      for (String str : list) {
         if (!map.containsKey(str)) {
            map.put(str, 0);
         }
         map.put(str, map.get(str)++);
         if (map.get(str) >= 3) {
            return true;
         }
      }
      return false;
   }
   
   // A method that take a Set<String> and returns a Map<Integer, Set<String>> which maps word length
   // to the words of that particular length which were in the original Set.
   public Map<Integer, Set<String>> split(Set<String> set) {
      Map<Integer, Set<String>> map = new TreeMap<Integer, Set<String>>();
      for (String str : set) {
         if (!map.containsKey(str.length())) {
            map.put(str.length(), new TreeSet<String>());
         }
         map.get(str.length()).add(str);
      }
      return map;
   }
}
