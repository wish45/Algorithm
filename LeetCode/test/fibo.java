package LeetCode.test;

/**
 * 질문
 * 트리보나치 함수 만들기
 * 트리보나치는 피보나치함수의 연장선으로 앞에 있는 3개의 정수를 합한 값을 출력한다. 2번째 array의  n의 갯수만큼 출력한다.
 * 단, 정수는 0 이상의 양수만 해당한다.
 * 예시
 * tribonacci([0, 0, 1], 9) // 결과값 == [0, 0, 1, 1, 2, 4, 7, 13, 24]
 * tribonacci([1, 1, 1], 5) // 결과값 == [1, 1, 1, 3, 5]
 * tribonacci([1, 2, 3], 2) // 결과값 == [1, 2]
 * */
public class fibo {
    public static void main(String args[]){
        fibo ins = new fibo();
        int[] nums = new int[]{0,0,1};
        int n = 9;
        System.out.println(ins.tribonacci(nums, n));
    }
    public int[] tribonacci(int[] nums , int n){

        int len = nums.length;
        int dp[] = new int[n];
        int ret[] = new int[n];

        for(int i=0; i<len; i++){
            dp[i] = nums[i];
        }

        for(int i=0; i<n; i++){
            if(i==0 || i==1 || i==2){
                ret[i] = dp[i];
            }else{
                ret[i] = dp[i-1] +dp[i-2] + dp[i-3];
            }
        }

        for(int i = 0 ; i<ret.length; i++){
            System.out.println(ret[i]);
        }
        return ret;

    }
}
