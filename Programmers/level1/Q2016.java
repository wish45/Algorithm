package level1;

import java.time.LocalDate;

public class Q2016 {
    /**
     * a,b를 입력받아 2016년의 a월 b일이 무슨요일인지 리턴하는 알고리즘
     * 5월24일은 THE
     * */
    public static void main(String args[]){
        Q2016 asd = new Q2016();
        System.out.println(asd.solution(5,24));
    }
    public String solution(int a, int b) {
        String answer = LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
        return answer;
    }
}
