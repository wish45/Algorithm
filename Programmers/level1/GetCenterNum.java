package level1;

public class GetCenterNum {
    /**
     * 문자열을 입력받아서 가운데 글자 출력하기
     * */
    public static void main(String args[]){
        GetCenterNum asd = new GetCenterNum();
        System.out.println(asd.solution("qwer"));
    }
    public String solution(String s) {
        String answer = "";

        int i = s.length() / 2;

        if(s.length()%2!=0){
            answer = String.valueOf(s.charAt(i));
        }else{
            answer = String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i));
        }
        
        return answer;
    }
}
