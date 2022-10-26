package level1;

public class AddDigits {
    /**
     * 자연수 n을 입력받아서 각 자릿수를 더한 합을 리턴
     * */
    public static void main(String args[]){
        AddDigits asd = new AddDigits();
        System.out.println(asd.solution(123));
    }
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n = n/10;
        }
        return answer;
    }
}
