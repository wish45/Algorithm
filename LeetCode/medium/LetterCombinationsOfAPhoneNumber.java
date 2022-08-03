package LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    ArrayList<String> ret;
    ArrayList[] alpha;
    int length;
    String digits2;
    
    public List<String> letterCombinations(String digits) {
        ret = new ArrayList<String>();
        alpha = new ArrayList[8];

        for(int i=0; i<8; i++){
            alpha[i] = new ArrayList<String>();
        }

        length = digits.length();

        if(length<1){
            return ret;
        }

        alpha[0].add("a");
        alpha[0].add("b");
        alpha[0].add("c");

        alpha[1].add("e");
        alpha[1].add("d");
        alpha[1].add("f");

        alpha[2].add("g");
        alpha[2].add("h");
        alpha[2].add("i");

        alpha[3].add("j");
        alpha[3].add("k");
        alpha[3].add("l");

        alpha[4].add("m");
        alpha[4].add("n");
        alpha[4].add("o");

        alpha[5].add("p");
        alpha[5].add("q");
        alpha[5].add("r");
        alpha[5].add("s");

        alpha[6].add("t");
        alpha[6].add("u");
        alpha[6].add("v");

        alpha[7].add("w");
        alpha[7].add("x");
        alpha[7].add("y");
        alpha[7].add("z");

        digits2 = digits;
        calc(new String(),0);

        return ret;
    }

    public void calc(String str, int curIndex){
        //재귀함수 종료조건
        if(curIndex==length){
            ret.add(str);
            return;
        }
        int val = digits2.charAt(curIndex)-'0';
        ArrayList<String> cur = alpha[val-2];

        for(int i=0; i<cur.size(); i++){
            calc(str+cur.get(i), curIndex+1);
        }

        return;
    }
}
