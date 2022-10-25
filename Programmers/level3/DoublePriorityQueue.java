package level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {
    public static void main(String args[]){
        DoublePriorityQueue asd = new DoublePriorityQueue();

        //String[] str = new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        String[] str = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        
        System.out.println(asd.solution(str));
    }
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> minQ =new PriorityQueue();
        PriorityQueue<Integer> maxQ =new PriorityQueue(Collections.reverseOrder());
        
        for(int i=0; i<operations.length;i++){
            if(operations[i].startsWith("I")){
                minQ.offer(Integer.parseInt(operations[i].substring(2)));
                maxQ.offer(Integer.parseInt(operations[i].substring(2)));
            }else if(operations[i].equals("D -1")){
                if(!minQ.isEmpty()) {
                    maxQ.remove(minQ.peek());
                    minQ.poll();
                }
            }else if(operations[i].equals("D 1")){
                if(!maxQ.isEmpty()){
                    minQ.remove(maxQ.peek());
                    maxQ.poll();
                }
            }
        }
        // 큐가 비어있지 않으면 [최댓값, 최솟값]
        if(!maxQ.isEmpty()){
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }

        return answer;
    }
}
