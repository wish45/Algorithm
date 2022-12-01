package level2;

import java.util.Arrays;

public class HIndex {
    public static void main(String args[]){
        HIndex asd = new HIndex();
        int[] num = new int[]{3, 0, 6, 1, 5};
        System.out.println(asd.solution(num));
    }
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int answer = 0;

        //{0,1,3,5,6}
        for(int i=0; i<citations.length; i++){
            int h = citations.length-i;
            if(citations[i]>=h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}
