package level1;

public class StringToInteger {
    public static void main(String args[]){
        StringToInteger asd = new StringToInteger();
        String str = "1234";
        System.out.println(asd.solution(str));
    }
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
}
