package level1;

public class Subak {
    /**
     * n의 길이만큼 수,박,수,박 을 반복하여 문자열을 리턴
     * */
    public static void main(String args[]){
        Subak asd= new Subak();
        System.out.println(asd.solution(4));
    }
    public String solution(int n) {
        String answer = "";
        String[] str = new String[]{"수","박"};

        for(int i=0; i<n; i++){
            if(i%2==0){
                answer +=str[0];
            }else{
                answer +=str[1];
            }
        }
        return answer;
    }
}
