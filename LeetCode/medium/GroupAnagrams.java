package LeetCode.medium;

import java.util.*;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();
      for (String str : strs) {
          String sorted = sorted(str);
          map.putIfAbsent(sorted, new ArrayList<>());
          map.get(sorted).add(str);
      }
      return new ArrayList<>(map.values());
  }

    public String sorted(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

