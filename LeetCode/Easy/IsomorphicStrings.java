package LeetCode.Easy;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
            if (map.getOrDefault(s.charAt(i), ' ') != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
