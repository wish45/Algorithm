package LeetCode.Easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s2="";

        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)<='9' && s.charAt(i)>='0')){
                s2+=s.charAt(i);
            }
        }

        int i=0;
        int j=s2.length()-1;

        while(i<j){
            if(s2.charAt(i)==s2.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
