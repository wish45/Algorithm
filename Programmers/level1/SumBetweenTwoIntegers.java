package level1;

public class SumBetweenTwoIntegers {
    public static void main(String args[]){
        /**
         * a,b가 주어졌을때, a와 b사이에 숫자를 모두 더한값을 리턴
         * */
        SumBetweenTwoIntegers asd = new SumBetweenTwoIntegers();
        System.out.println(asd.solution(5,3));
    }
    public long solution(int a, int b) {
        long answer = 0;

        if(a>b){
            int tmp=0;
            tmp=a;
            a=b;
            b=tmp;
        }
        for(int i=a; i<=b; i++){
            answer += i;
        }
        return answer;
    }
}
