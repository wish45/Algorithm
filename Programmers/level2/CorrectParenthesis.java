package level2;

import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String args[]){
        CorrectParenthesis asd = new CorrectParenthesis();
        //String str  = "()()";
        String str  = "(())()";
        
        System.out.println(asd.solution(str));
    }
    boolean solution(String s) {
        boolean answer = true;
        Stack stk = new Stack();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(s.charAt(i));
            }else{
                if(stk.size()==0){
                    return false;
                }
                stk.pop();
            }
        }
        if(!stk.isEmpty()) {
            answer = false;
        }
        
        return answer;
    }
}
