package LeetCode.Easy;

class PalindromeNumber {
    static int[][] dpValue; //중복된 결과를 저장하는 배열

    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int length = str.length();
        dpValue = new int[length][length];
        int ret = calc(str,0,length-1);

        if(ret==1){
            return true;
        }else{
            return false;
        }
    }
    public static int calc(String s, int start , int end){
        if(start>=end){
            return 1;
        }
        if(dpValue[start][end]!=0){
            return dpValue[start][end];
        }
        int ret = -1;

        if(s.charAt(start)==s.charAt(end)){
            ret = calc(s, start+1, end-1);
        }
        dpValue[start][end] = ret;
        return ret;
    }
}