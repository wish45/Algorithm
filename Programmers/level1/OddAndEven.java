package level1;

public class OddAndEven {
    public static void main(String args[]){
        OddAndEven asd = new OddAndEven();
        System.out.println(asd.solution(2));

    }
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        }else{
            answer = "Odd";
        }

        return answer;
    }
}
