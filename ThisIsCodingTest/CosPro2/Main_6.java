package CosPro2;

import java.util.Arrays;

public class Main_6 {
    public int[] solution(String commands) {
        int[] answer = {0, 0};
        int x = 0;
        int y = 0;
        for (int i = 0; i < commands.length(); i++) {
            char ch = commands.charAt(i);
            if (ch == 'R') {
                answer[0] = answer[0] + 1;
            } else if (ch == 'L') {
                answer[0] = answer[0] - 1;
            } else if (ch == 'U') {
                answer[1] = answer[1] + 1;
            } else if (ch == 'D') {
                answer[1] = answer[1] - 1;
            }
        }
        return answer;
    }


    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main_6 sol = new Main_6();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
