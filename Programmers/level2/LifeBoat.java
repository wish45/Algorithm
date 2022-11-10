package level2;

import java.util.Arrays;

public class LifeBoat {
    /**
     * 탐욕법
     * 몸무게 peopel 배열과 , limit 최대적재량이 주어진다.
     * 보트는 최대 적재량만큼 인원을 태울 수 있고, 구명보트가 필요한 최소값을 리턴하라
     *
     * */
    public static void main(String args[]){
        LifeBoat asd = new LifeBoat();
        int[] p = new int[]{70, 50, 80, 50};
        System.out.println(asd.solution(p,100));
    }
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);   //50, 50, 70, 80
        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            if(people[i] + people[index] <= limit){
                   index++;
                   answer++;
            }else {
                answer++;
            }
        }

        return answer;
    }
}
