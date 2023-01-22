package level1;

import java.util.Arrays;

public class KthNumber {
    /**
     * K번째 수
     * array 배열에서 2번째부터 5번째까지 짤라서 정렬 후 3번째 원소를 answer 변수에 저장.
     * commands 크기만큼 answer에 담아서 리턴하라
     * */
    public static void main(String args[]){
        KthNumber asd = new KthNumber();
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1},{1, 7, 3}};

        System.out.println(asd.solution(array, commands));

    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tmp = {};

        for(int i=0; i<commands.length; i++){
                tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(tmp);
                answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }
}
