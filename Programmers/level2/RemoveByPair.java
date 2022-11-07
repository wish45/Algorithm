package level2;

import java.util.Stack;

public class RemoveByPair {
    /**
     * 문자열이 주어졌을떄, 인접한 문자를 제거하는 로직
     * 예를 들어, 문자열 S = baabaa 라면
     * b aa baa → bb aa → aa →
     *
     * true면 1, false면 0을반환
     * */
    public static void main(String args[]){
        RemoveByPair asd = new RemoveByPair();
        System.out.println(asd.solution("cdcd"));
    }
    public int solution(String s)
    {
        int answer = 1;

        Stack stk = new Stack();

        for(int i=0; i<s.length();i++){
            if(stk.isEmpty()){
                stk.add(s.charAt(i));
            }else{
                if(stk.peek().equals(s.charAt(i))){
                    stk.pop();
                }else{
                    stk.push(s.charAt(i));
                }
            }

        }
        if(!stk.isEmpty()){
            return 0;
        }

        return answer;
    }
}
