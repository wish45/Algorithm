package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    List<String> ret;

    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<String>();
        calc(n, n, "");
        return ret;

    }

    public void calc(int open, int close, String str) {
        if (open == 0 && close == 0) {
            ret.add(str);
            return;
        }
        if (open == close) {
            calc(open - 1, close, str + "(");
        } else { //열린괄호가 닫힌 괄호보다 작을경우
            if (open > 0) {
                calc(open - 1, close, str + "(");
            }
            calc(open, close - 1, str + ")");
        }
    }
}
