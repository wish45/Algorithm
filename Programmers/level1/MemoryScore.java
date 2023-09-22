package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    /**
     * name이 있고 yearning에는 추억점수가 존재한다.
     * photo라는 이차원 배열에 이름들이 존재할때 추억점수를 합한 결과를 배열로 리턴하기.
     * @param args
     */
    public static void main(String[] args) {
        MemoryScore asd = new MemoryScore();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] scores = asd.solution(name, yearning, photo);

        /*for (int score : scores) {
            System.out.println(score);
        }*/
        Arrays.stream(scores).forEach(System.out::println);

    }
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameAndCnt = new HashMap<>();
        for(int i=0; i<name.length; i++){
            nameAndCnt.put(name[i],yearning[i]);
        }

        return Arrays.stream(photo)
                .mapToInt(p -> Arrays.stream(p)
                .mapToInt(n -> nameAndCnt.getOrDefault(n, 0))
                .sum())
                 .toArray();

    }
/*    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> nameAndCnt = new HashMap<>();
        for(int i=0; i<name.length; i++){
            nameAndCnt.put(name[i],yearning[i]);
        }

        for(int i=0; i<photo.length; i++){
            int cnt = 0;
            for (String person : photo[i]) {
                cnt += nameAndCnt.getOrDefault(person, 0);
            }
            answer[i] = cnt;
        }
        return answer;
    }*/
}
