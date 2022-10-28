package level2;

public class Fibo {
    /**
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n-1) + f(n-2)
     * 2이상의 n이 입력되었을때, n번째 피보나치수를 1234567로 나눈값으로 리턴하기.
     * 처음에는 재귀함수로 해결하려 하였지만, 시간초과가 발생하여 다이나믹 프로그래밍으로 처리.
     *
     * */
    public static void main(String args[]){
        Fibo asd = new Fibo();
        System.out.println(asd.solution(5));
    }
/*
    int answer = 0;

    public int solution(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            fibo(n);
        }
        return answer;
    }

    public int fibo(int n){
        answer = solution(n-1) + solution(n-2);
        return  answer % 1234567;
    }*/


  public int solution(int n) {
        int answer = fibo(n);
        System.out.println(answer);
        return answer;
    }

    public int fibo(int n) {
        int[] tmp = new int[n+1];

        tmp[0] = 0;
        tmp[1] = 1;

        for (int i=2; i<= n; i++){
            tmp[i] = (tmp[i-1] + tmp[i-2]) % 1234567;
        }

        return tmp[n] % 1234567;
    }
}
