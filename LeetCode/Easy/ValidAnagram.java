package LeetCode.Easy;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int[] char_counts = new int[26]; //알파벳 26자

        for(int i=0; i<s.length(); i++){
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for(int i=0; i<char_counts.length; i++){
            if(char_counts[i]!=0){
                return false;
            }
        }

        return true;
    }
    /*public boolean isAnagram(String s, String t) {  //이거는 중복으로 알파벳이 존재할시에 통과안됨.
        boolean dpValue[] = new boolean[s.length()];

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0; i<s.length(); i++){
            if(dpValue[i] == true){
                continue;
            }
            for(int j= 0; j<t.length(); j++){
                if(s.charAt(j) == t.charAt(i)){
                    dpValue[i] = true;
                    continue;
                }
            }
        }
        for(int i=0; i<dpValue.length; i++){
            if(dpValue[i]!=true){
                return false;
            }
        }
        return true;
    }*/
}







