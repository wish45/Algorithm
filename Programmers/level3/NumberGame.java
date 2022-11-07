package level3;

import java.util.Arrays;

public class NumberGame {
    /**
     * A,B 배열이 있을떄,
     * A가 이미 순서가 정해져있다면,
     * B가 얻을 수 있는 최대 승점을 리턴하시오
     * */
    public static void main(String args[]){
        NumberGame asd = new NumberGame();
        //int[] n1 = new int[]{5,1,3,7};
        //int[] n2 = new int[]{2,2,6,8};
        int[] n1 = new int[]{2,2,2,2};
        int[] n2 = new int[]{1,1,1,1};

        System.out.println(asd.solution(n1,n2));
    }
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int index = 0;
        for(int i=0; i<A.length; i++){
            if(A[index]< B[i]) {
                answer++;
                index++;
            }

        }
        return answer;
    }
}
