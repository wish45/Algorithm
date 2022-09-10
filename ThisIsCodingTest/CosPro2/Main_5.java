package CosPro2;

public class Main_5 {
    public int solution(int[] arr) {
        int answer = 0;
        int maxCnt = 0;
        int max = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxCnt++;
            } else {
                answer = Math.max(maxCnt, answer);
                maxCnt = 0;
                maxCnt++;
                max = arr[i];
            }
        }
        return answer;
    }


    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main_5 sol = new Main_5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

