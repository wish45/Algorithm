package level1;

public class Coke {
    /**
     * a개의 빈병을 마트에 가져다주면, 콜라 b개를 주고, n개의 콜라가 존재할때, 총 몇개의 콜라를 먹을 수 있을까?
     * a=2, b=1, n=20, result=?
     */
    public static void main(String args[]) {
        Coke asd = new Coke();
        System.out.println(asd.solution(2, 1, 20));
       //System.out.println(asd.solution(3, 1, 20));

    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            if(n<a){
                break;
            }

            answer+=(n/a)*b;
            int remain = n%a;

            n = (n/a)*b + remain;

        }

        return answer;

    }
}

