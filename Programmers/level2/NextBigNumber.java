package level2;

public class NextBigNumber {
    /**
     * n을 입력받는다
     * n의 다음큰숫자는 n보자 큰 자연수
     * n과 n의 다음큰 숫자는 이진수 변환후 1의갯수가 같다
     * n의 다음큰 숫자는 위 두 조건을 만족하는 수 중 가장 작은수이다.
     *
     * n    result
     * 78	83
     * 15	23
     */
    public static void main(String args[]) {
        NextBigNumber asd = new NextBigNumber();
        System.out.println(asd.solution(15));
    }

    public int solution(int n) {
        int answer = 0;
        String cur = Integer.toBinaryString(n);

        int cnt1 = 0;
        for (int i = 0; i < cur.length(); i++) {
            if (cur.charAt(i) == '1') {
                cnt1++;
            }
        }

        while (true) {
            n += 1;
            String next = Integer.toBinaryString(n);
            int cnt2 = 0;
            for (int i = 0; i < next.length(); i++) {
                if (next.charAt(i) == '1') {
                    cnt2++;
                }
            }
            if (cnt1 == cnt2) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}