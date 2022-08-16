package LeetCode.Easy;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hash = new HashMap<>();
        String[] str = new String[s.length()];
        str =  s.split(" ");

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(hash.containsKey(c)){
                if(!hash.get(c).equals(str[i])){        
                    return false;
                }
            }else{
                if(hash.values().contains(str[i])){
                    return false;
                }
                hash.put(c,str[i]);
            }
        }
        return true;

    }
}
