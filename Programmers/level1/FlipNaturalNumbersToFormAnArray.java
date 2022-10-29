package level1;

public class FlipNaturalNumbersToFormAnArray {
    /**
     * 자연수 n을 입력받아 뒤집어 배열 역순으로 정렬
     * n = 12345 이면 5,4,3,2,1 리턴
     *
     * */
    public static void main(String args[]){
        FlipNaturalNumbersToFormAnArray asd = new FlipNaturalNumbersToFormAnArray();
        System.out.println(asd.solution(12345));
    }
    public long[] solution(long n) {
        String len = n+"";
        long[] answer = new long[len.length()];

        for(int i=0; i<len.length(); i++){
            answer[i] = n%10;
            n = n/10;

        }
        return answer;
    }
}
