package LeetCode.Easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        String maxStr = "";
        int index=0;

        if(length<1){
            return maxStr;
        }

        while(true){
            char ch;
            if(strs[0].length()<=index){
                return maxStr;
            }
            ch = strs[0].charAt(index);
            for(int i=1; i<length; i++){
                if(strs[i].length()<=index){
                    return maxStr;
                }
                if(strs[i].charAt(index)!=ch){
                    return maxStr;
                }
            }
            index++;
            maxStr+=ch;


        }
    }
}
