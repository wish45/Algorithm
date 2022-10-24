package level3;

import java.util.Arrays;

public class BestSet {
    public static void main(String args[]){
        BestSet asd = new BestSet();
        System.out.println(asd.solution(2,9));
    }
    //n개의 자연수 집합을 만든다
    //n개의 자연수의 합계는 s
    //두 자연수를 곱한 값이 최대값이 되는 집합을 리턴해라
    public int[] solution(int n, int s) {
        int[] answer = null;

        if (n>s) return new int[] {-1};
        answer = new int[n];
        Arrays.fill(answer,s/n);
        for (int i=s%n, j=answer.length-1; i>0 ; i--, j--){
            answer[j]+=1;
        }

        return answer;
    }
}
