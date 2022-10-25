package level1;

public class SumOfFactors {
    /**
     * n의 정수를 입력받아서 약수의 합을 구하는 문제
     * */
    
    public static void main(String args[]){
      SumOfFactors asd = new SumOfFactors();
      System.out.println(asd.solution(5));
    }
    
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}
