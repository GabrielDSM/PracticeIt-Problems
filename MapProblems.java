// Gabriel Menescal
// This file contains various solutions to Map practice-it problems

public class MapProblems {
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