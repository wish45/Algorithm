package level2;

import java.util.Arrays;
import java.util.Collections;

public class NLeastCommonMultiples {
    /**
     * 배열이 주어졌을때 최소공배수 구하기
     *
     * */
    public static void main(String args[]){
        NLeastCommonMultiples asd = new NLeastCommonMultiples();
        int[] arr = new int[]{2,6,8,14};
        System.out.println(asd.solution(arr));
    }
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=0; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    static int gcd(int a, int b){
        if(a%b == 0){
            return b;
        }

        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
