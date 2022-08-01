package medium;

public class CountAndSay {
    public String countAndSay(int x) {
        if(x == 1) return "1";
        String s = countAndSay(x - 1);
        String ans = "";
        int n = s.length();
        int prev = -1, count = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) - '0' == prev) {
                count++;
            }
            else {
                if(count != 0) ans = ans + Integer.toString(count) + Integer.toString(prev);
                count = 1;
                prev = s.charAt(i) - '0';
            }
        }
        if(count != 0) {
            ans = ans + Integer.toString(count) + Integer.toString(prev);
        }
        return ans;
    }
}
