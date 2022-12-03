package level2;

public class LongJump {
    /**
     * 한칸 또는 두칸을 뛸 수 있다.
     * 칸이 총 n 칸 있을때 끝에 도달하는 방법이 몇가지일지 값을 return.
     * 
     * */
    public static void main(String args[]){
        LongJump asd = new LongJump();
        System.out.println(asd.solution(3));
    }
    public long solution(int n) {
        long answer = 0;

        int[] arrays = new int[n + 1];

        arrays[0] = 1;
        arrays[1] = 1;

        for (int i = 2; i <= n; i++) {
            arrays[i] = (arrays[i - 1] + arrays[i - 2])%1234567;
        }

        return arrays[n];
    }
}

