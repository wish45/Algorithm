package level2;

public class Carpet {
    public static void main(String args[]){
        Carpet asd = new Carpet();
        System.out.println(asd.solution(10,2));
    }
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        int ret = 0;
        ret = brown + yellow;
        //두 수를 곱해서 ret가 되게 끔하는 n과 m구하기

        for(int i=2; i<ret; i++){
            int m=0;
            int n=0;

            if(ret%i==0){
                n = ret/i;
                m = ret/n;
                if(m>2 && m>=n && yellow == (m-2) * (n-2)){ //노란색이 위치하기 위해서 필요한 조건
                    answer[0] = m;
                    answer[1] = n;
                    break;
                }
            }

        }
        return answer;
    }
}
