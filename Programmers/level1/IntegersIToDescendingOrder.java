package level1;

import java.util.Arrays;

public class IntegersIToDescendingOrder {
    public static void main(String args[]){
     IntegersIToDescendingOrder asd = new IntegersIToDescendingOrder();
        System.out.println(asd.solution(118372));
    }
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        Long.parseLong(sb.reverse().toString());

        return answer;
    }
}
