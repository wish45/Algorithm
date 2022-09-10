package CosPro2;

import java.util.*;

public class Main_4 {
    public int solution(int[] arr, int K) {
        int answer = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int endLength = length - 1;
                while (j < endLength) {
                    int sum = arr[i] + arr[j] + arr[endLength];
                    if (sum % K == 0) {
                        answer++;
                    }
                    endLength--;
                }

            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main_4 sol = new Main_4();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
