package level1;

public class NnumbersSpacedByX {
    /**
     * 자연수 X와 N을 입력받아서 x부터 x+2... n까지 증가하는 숫자배열을 반환하는 로직구현
     * */
    public static void main(String args[]){
        NnumbersSpacedByX asd = new NnumbersSpacedByX();
        System.out.println(asd.solution(-4,2));
    }
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long tmp = x;

        for(int i=0; i<n; i++){
            answer[i] = tmp;
            tmp += x;
        }
        return answer;
    }
}
