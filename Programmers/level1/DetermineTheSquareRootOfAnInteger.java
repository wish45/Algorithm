package level1;

public class DetermineTheSquareRootOfAnInteger {

    /**
     * n을 입력받고,n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 한다.
     * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴
     * */

    public static void main(String args[]){
          DetermineTheSquareRootOfAnInteger asd = new DetermineTheSquareRootOfAnInteger();
        System.out.println(asd.solution(3));
        
    }
    public long solution(long n) {
        long answer = 0;
        long sq = 0;

        for(long i=1; i<=i*i; i++){
            if(i*i>n){
                return -1;
            }else if(i*i==n){
                sq = i;
                break;
            }
        }

        answer = (sq+1)*(sq+1);


        return answer;
    }
}
