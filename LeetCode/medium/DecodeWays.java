package LeetCode.medium;

public class DecodeWays {
    public static void main(String args[]){
        DecodeWays asd = new DecodeWays();

        System.out.println(asd.numDecodings("1234"));

    }
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0')
            return 0;
        int len = s.length();
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len; i++) {
            int one = Integer.parseInt(s.substring(i, i + 1));
            int two = Integer.parseInt(s.substring(i - 1, i + 1));
            if (one >= 1 && one <= 9)
                dp[i] += dp[i - 1];
            if (two >= 10 && two <= 26)
                dp[i] += (i >= 2 ? dp[i - 2] : 1);
        }
        return dp[len - 1];
    }
}




