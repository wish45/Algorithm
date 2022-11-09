package level2;

import java.util.HashSet;
import java.util.Set;

public class EndingInEnglish {
    /**
    *  영어 끝말잇기, n명이 주어지고 몇번째 사람이 틀린 단어를 말했는지,
     *  n, m번쨰 단어의 순서를 리턴
    *
    * */
    public static void main(String args[]){
        EndingInEnglish asd = new EndingInEnglish();
        String[] str = new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        //String[] str = new String[]{"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(asd.solution(3,str));
    }
    public int[] solution(int n, String[] words) {
/*        int[] answer = {0,0};
        Set se = new HashSet();


        for(int i=0; i<words.length; i++) {
            if (i == 0) {
                se.add(words[i]);
            } else {
                if ((words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) && !se.contains(words[i])) {
                    se.add(words[i]);

                } else {
                    answer[0] = (i%n)+1;
                    answer[1] = (i / n) + 1;;
                }
            }


        }

        return answer;*/

        int[] answer = {0, 0};


        Set se = new HashSet();

        for(int i = 0; i < words.length; i++) {
            if(i != 0) {
                String s1 = words[i - 1];
                String s2 = words[i];

                char last = s1.charAt(s1.length() - 1);
                char first = s2.charAt(0);

                if(se.contains(s2) || last != first) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;

                    return answer;
                }
            }

            se.add(words[i]);
        }

        return answer;
    }
}
