package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCake {
    /**
     * 롤케익이 토핑의 갯수를 공평하게 나누는 알고리즘
     * ex) [1, 2, 1, 3, 1, 4, 1, 2]
     *  [1,2,1,3] [1,4,1,2]  ,  [1,2,1,3,1] [4,1,2]   2가지 경우가 존재.
     *  첫번쨰 풀이 시간초과
     * */
    public static void main(String args[]){
       RollCake asd = new RollCake();
       int[] toping = new int[]{1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(asd.solution(toping));
    }
    public int solution(int[] topping) {
      /*  int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0; i<topping.length; i++){
            set1.clear();;
            set2.clear();;

            for(int j=0; j<i+1; j++){
                set1.add(topping[j]);
            }
            for(int k=i+1; k<topping.length;k++){
                set2.add(topping[k]);
            }
            if(set1.size()==set2.size()){
                answer++;
            }
        }
        return answer;*/


        int length = topping.length;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        set.add(topping[0]);
        for (int i = 1; i < length; i++) {
            int number = topping[i];
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int answer = 0;
        for (int i = 1; i < length; i++) {
            int number = topping[i];

            set.add(number);

            int numberSize = map.get(number);
            if (numberSize == 1) {
                map.remove(number);
            } else {
                map.put(number, numberSize - 1);
            }

            if (set.size() == map.size()) {
                answer++;
            }
        }

        return answer;
    }
}
