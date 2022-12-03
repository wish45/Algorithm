package level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Camouflage {
    /**
     * 의복 종류와 의복명이 있는 이차원 배열이 존재한다.
     * 겹치지 않게 옷을 입는 경우의 수를 구하는 integer를 리턴
     * 아무것도 안입는 경우는 없다.
     * */
    public static void main(String args[]){
        Camouflage asd = new Camouflage();
        String[][] clo = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(asd.solution(clo));
    }
    public int solution(String[][] clothes) {
        Map<String,Integer> set = new HashMap<>();

        for(int j=0; j<clothes.length; j++){
                set.put(clothes[j][1], set.getOrDefault(clothes[j][1], 0) + 1);
        }

        Iterator<Integer> it = set.values().iterator();
        int answer = 1;
        while(it.hasNext())
            answer = answer * (it.next().intValue() +1);

        return answer-1;
    }
}
