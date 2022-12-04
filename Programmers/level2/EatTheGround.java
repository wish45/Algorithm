package level2;

public class EatTheGround {
    /**
     * [연습문제 - dp]땅따먹기
     * | 1 | 2 | 3 | 5 |
     *
     * | 5 | 6 | 7 | 8 |
     *
     * | 4 | 3 | 2 | 1 |
     *
     * 한 행씩 하나의 숫자를 고를 수 있고, 한 행에서 고른 열은 다음행에서 고를 수 없다.
     * 최대 값을 구하라
     * */
    public static void main(String args[]){
        EatTheGround asd = new EatTheGround();
        int[][] map = new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        System.out.println(asd.solution(map));
    }
    int solution(int[][] land) {
        int answer = 0;
        /*
        int[][] map = new int[land.length][4];
        
        for(int i=1; i<land.length; i++){
            int index = 0;
            int max = 0;
            for (int j=1; j<land[0].length+1; j++){
                if( j == index)
                    continue;
                if(land[i-1][j-1] > max){
                    max = land[i-1][j-1];
                    map[i][j] = Math.max(max,map[i][j-1]);
                    index = j-1;
                }
            }
            
        }*/

        for(int i=1; i<land.length;i++){
            land[i][0] += Math.max(land[i-1][1],Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0],Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][0],Math.max(land[i-1][1], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][0],Math.max(land[i-1][1], land[i-1][2]));
        }

        for(int i=0; i<4; i++){
            answer = Math.max(answer,land[land.length-1][i]);
        }
        return answer;
    }
}
