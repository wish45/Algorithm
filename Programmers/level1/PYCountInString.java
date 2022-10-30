package level1;

import java.util.Locale;

public class PYCountInString {
    public static void main(String args[]){
        PYCountInString asd = new PYCountInString();
        System.out.println(asd.solution("Pyy"));
    }
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase(Locale.ROOT);
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'){
                p++;
            }else if(s.charAt(i)=='y'){
                y++;
            }
        }
        if(p!=y){
            answer = false;
        }
        return answer;
    }
}
