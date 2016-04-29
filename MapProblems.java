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
}
