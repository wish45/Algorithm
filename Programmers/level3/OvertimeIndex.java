package level3;


import java.util.Comparator;
import java.util.PriorityQueue;

public class OvertimeIndex {
    /**
     * 야근지수를 최소화 하는 값을 리턴하기
     * 퇴근까지 남은 n시간,   남을일의 작업량 {4, 3, 3}
     * 남은일의 작업량에서 n시간을 뺴서 최소화 하기
     * */
    public static void main(String args[]){
        OvertimeIndex asd = new OvertimeIndex();
        //int[] works = new int[]{4, 3, 3};
        int[] works = new int[]{1, 1};
        
        System.out.println(asd.solution(3,works));

    }
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<works.length;i++){
            queue.offer(works[i]);
        }
        
        for(int i=0; i<n; i++){
            int work = queue.poll();
            if(work==0){
                break;
            }else{
                queue.offer(work-1);
            }
        }
        int size = queue.size();
        for(int i=0; i<size;i++){
            answer+=Math.pow(queue.poll(),2);
        }

        return answer;
    }
}
