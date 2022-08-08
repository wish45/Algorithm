package LeetCode.Easy;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        String sum = s+s;

        if(s.length()==goal.length() && sum.contains(goal)){
            return true;
        }else{
            return false;
        }
    }
}
