package level2;

public class JadenCase {
    public static void main(String args[]){
        JadenCase asd = new JadenCase();
        System.out.println(asd.solution("3people unFollowed me"));

    }
 /*   public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();

        for(int i=0; i< ch.length; i++){

            //소문자를 대문자로 변환
            if(i==0 && ch[i]>=97 && ch[i] <=122 || i>0 && ch[i-1]==32){
                answer += (char)(ch[i]-32);
            }else if(ch[i]>=65 && ch[i]<=90){   //대문자를 소문자로 변환
                answer += (char)(ch[i]+32);
            }else{
                answer += ch[i];
            }

        }
        return answer;
    }*/

    public String solution(String s) {
        String answer = "";

        String[] str = s.split(" ");

        for(String ss : str)
            if(ss.length() > 0)
                answer += ss.substring(0,1).toUpperCase() + ss.substring(1).toLowerCase() + " ";
            else
                answer += " ";
        if (s.charAt(s.length() - 1) != ' ')
            answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}
