package level1;

public class DivideString {
    /**
     *   문자열 나누기
     *   문자열 s가 입력되었을때, 왼쪽에서 오른쪽으로 읽어나가면서
     *   첫번째 문자와 첫번쨰 문자가 아닌 다른 문자들이 나온 횟수를 센다.
     *   처음으로 두 횟수가 같아지는 순간 멈추고 읽은 문자열을 분리하여
     *   총 분리되어진 카운트를 리턴한다.
     *   ex) banana
     *   ba + na + na
     *   return 3
     * */
    public static void main(String[] args) {
        DivideString asd = new DivideString();
        System.out.println(asd.solution("banana"));
        //System.out.println(asd.solution("aaabbacc"));
    }
    public int solution(String s) {
        char first = s.charAt(0);
        int firstNum = 0;     //첫번째 숫자 갯수
        int diff = 0;       // 두번째 숫자 갯수
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result;


    }
}
