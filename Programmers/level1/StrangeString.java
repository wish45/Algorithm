package level1;

public class StrangeString {
    /**
     * 문자열을 입력받아서 짝수는 대문자, 홀수는 소문자로 문자열을 출력하기
     * try hello world -> TrY HeLlO WoRlD
     * */
    public static void main(String args[]){
        StrangeString asd = new StrangeString();
        System.out.println(asd.solution("try hello world"));
    }
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = 0;

        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                idx=0;
            }else if(idx%2==0){
                str[i] = str[i].toUpperCase();
                idx++;
            }else{
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer+=str[i];
        }
        return answer;

        /*String answer = "";
        String[] s1 = s.split(" ");

        for(int i=0; i<s1.length; i++){

            for(int j=0; j<s1[i].length(); j++){
                if(j%2!=0){
                    answer += String.valueOf(s1[i].charAt(j)).toLowerCase();
                }else{
                    answer += String.valueOf(s1[i].charAt(j)).toUpperCase();
                }

            }
            answer+=" ";
        }
        return answer.trim();*/
    }
}
