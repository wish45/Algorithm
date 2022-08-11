package LeetCode.Easy;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String args[]){
        RemoveAllAdjacentDuplicatesInString asd = new RemoveAllAdjacentDuplicatesInString();
        System.out.println(asd.removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack();
        String ret = "";
        StringBuffer asd = null;

        for(int i=0; i<s.length(); i++){
            if(stk.empty() || stk.peek() != s.charAt(i)){
                stk.push(s.charAt(i));
            }else{
                stk.pop();
            }
        }
        while(!stk.empty()){
            ret += stk.pop() ;
        }

        asd = new StringBuffer(ret);
        ret = asd.reverse().toString();
        return ret;
    }
}
