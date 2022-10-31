package level1;

public class HashadeNumber {
    /**
     * x를 입력받고 x의 각 자리수의 합으로 x를 나눴을때 나누어 떨어지면 true, 아니면 false를 리턴
     * */
    public static void main(String args[]){
        HashadeNumber asd = new HashadeNumber();
        System.out.println(asd.solution(13));
    }
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int num = x;
        while(x>0){
            sum += x%10;
            x = x/10;
        }
        if(num%sum!=0){
            return false;
        }
        
        return answer;
    }
}
