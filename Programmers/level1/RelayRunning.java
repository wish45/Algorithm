package level1;

import java.util.*;
import java.util.stream.IntStream;

public class RelayRunning {
    /**
     *  players와 callings 배열이 존재.
     *  callings에 순서대로 선수이름을 호명하고 선수가 호명될때마다 players의 배열에서
     *  호명된 선수가 한칸씩 앞으로 이동.
     *  최종 순서의 리스트를 반환하라.
     * @param args
     */
    public static void main(String args[]){
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        RelayRunning asd = new RelayRunning();
        System.out.println(asd.solution(players,callings));
    }
    public String[] solution(String[] players, String[] callings) {
        int n = players.length;
        Map<String, Integer> playerToIndex = new HashMap<>();
        String[] rankToPlayer = new String[n];

        // 초기 등수와 선수 이름 매핑
        IntStream.range(0, n).forEach(i -> {
            playerToIndex.put(players[i], i);
            rankToPlayer[i] = players[i];
        });

        // 경주 진행
        Arrays.stream(callings).forEach(calling -> {
            int currentIndex = playerToIndex.get(calling);
            int frontIndex = currentIndex - 1;

            // Swap
            playerToIndex.put(calling, frontIndex);
            playerToIndex.put(rankToPlayer[frontIndex], currentIndex);

            rankToPlayer[currentIndex] = rankToPlayer[frontIndex];
            rankToPlayer[frontIndex] = calling;
        });

        return rankToPlayer;

    }
    /**
     *
     * @param players
     * @param callings
     * @return
     */
/*    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        for(int i=0; i < callings.length; i++){
            for(int j=0; j < players.length; j++){
                if(callings[i]==players[j]){
                    String tmp = "";
                    tmp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = tmp;
                }else{
                    continue;
                }
            }
        }


        answer = players;
        for(String asd : answer){
            System.out.println(asd);
        }
        return answer;
    }*/

}
