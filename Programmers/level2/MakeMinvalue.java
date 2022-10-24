package level2;

import java.util.Arrays;

public class MakeMinvalue {
    public static void main(String args[]){
        MakeMinvalue asd = new MakeMinvalue();
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        System.out.println(asd.solution(a,b));
        
    }
    public int solution(int []A, int []B)
    {
        int sum = 0;
        int answer = 0;
        int len = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<len; i++){
            answer += A[i]*B[len-1-i];
        }

        
        return answer;
    }
}
