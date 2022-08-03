package LeetCode.Easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        int length = s.length();
        Stack<Character> stk = new Stack<>();
        boolean ret;

        for(int i=0; i<length; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }else if(!stk.empty()){
                if(s.charAt(i)==')' && stk.peek()=='(' || s.charAt(i)==']' && stk.peek()=='[' || s.charAt(i)=='}' && stk.peek()=='{' ){
                    stk.pop();
                }else{
                    stk.push(s.charAt(i));
                }
            }else{
                stk.push(s.charAt(i));
            }
        }
 
        if(stk.empty()){
            ret = true;
        }else{
            ret = false;
        }
        return ret;
    }
}
