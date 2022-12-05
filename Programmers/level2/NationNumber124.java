package level2;

public class NationNumber124 {
    /**
     * 10진법이 아닌, 1,2,4만 허용되는 숫자를 만들어라
     * */
    public static void main(String args[]){
        NationNumber124 asd= new NationNumber124();
        System.out.println(asd.solution(4));
    }
    public String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}