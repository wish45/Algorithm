package level1;

public class SumOfmeasure {
    public static void main(String args[]){
        SumOfmeasure asd = new SumOfmeasure();
        int[] num = new int[]{1,2,3,4};
        System.out.println(asd.solution(num));

    }
    public double solution(int[] arr) {
        double answer = 0;
        int len = arr.length;
        double sum = 0;
        for(int i=0; i<len; i++){
            sum += arr[i];
        }
        answer = sum/len;
        
        return answer;
    }
}
