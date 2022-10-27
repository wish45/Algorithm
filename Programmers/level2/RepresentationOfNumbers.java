package level2;

public class RepresentationOfNumbers {
    /**
     * n을 입력받고 연속된 자연수들의 합으로 n을 표현하는 방법의 수를 return
     *
     * */
    public static void main(String args[]){
        RepresentationOfNumbers asd = new RepresentationOfNumbers();
        System.out.println(asd.solution(15));
    }
    public int solution(int n) {
        int answer = 0;

        for(int start=0; start<n; start++){
            int sum = 0;
            int add = 0;
            add = start;
            
            while(sum<=n){
                sum = sum + add + 1;
                add++;
                if(sum==n){
                    answer++;
                    break;
                }
            }
        }


        return answer;
    }
}
