package LeetCode.medium;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        boolean[] used = new boolean[128];
        int maxCount = 0;
        int count = 0;


        if(maxCount==1){
            return maxCount;
        }

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                char cs = s.charAt(j);
                if(!used[cs]){//128개의 아스키 배열안에 존재하지 않으면,
                    used[cs] = true;
                    count++;

                }else{
                    break;
                }
            }
            maxCount = Math.max(count,maxCount);
            count=0;
            used = new boolean[128];
        }
        return maxCount;
    }
}
