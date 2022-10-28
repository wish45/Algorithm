package level3;

public class WayToSchool {
    /**
     * n*m의 칸에서 학교위치 n*m 위치에 있는 학교까지 최단거리의 갯수를 1,000,000,007 로 나눈 나머지를 return 하라
     *
     * m  = 4
     * n = 3
     *
     * puddles = {2,2}
     *
     * return 4
     *
     * input 값이 위와같을때 이차원 배열 아래와같이 최단경로가 저장.
     *
     * //1, 1, 1, 1
     * //1, 0 ,1, 2
     * //1, 1, 2, 4
     * */
    public static void main(String args[]){
         WayToSchool asd = new WayToSchool();
         int[][] puddles = new int[][]{{2,2}};
        System.out.println(asd.solution(4,3, puddles));
    }

    public int solution(int m, int n, int[][] puddles) {


        int[][] tmp = new int[n][m];

        // 웅덩이는 -1
        for (int[] puddle : puddles)
            tmp[puddle[1] - 1][puddle[0] - 1] = -1;

        tmp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(tmp[i][j] == -1) {
                    tmp[i][j] = 0;
                    continue;
                }
                //위쪽
                if(i != 0)
                    tmp[i][j] += tmp[i - 1][j] % 1000000007;

                //왼쪽
                if(j != 0)
                    tmp[i][j] += tmp[i][j - 1] % 1000000007;
            }
        }

        return tmp[n - 1][m - 1] % 1000000007;
    }


}
