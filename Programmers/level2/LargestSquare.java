package level2;

public class LargestSquare {
    /**
     *    2차원 배열이 주어질때 1로 표시된 가장 큰 정사각형의 넓이를 리턴하는 알고리즘
     * */
    public static void main(String args[]){
        LargestSquare asd = new LargestSquare();
        int[][] board = new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(asd.solution(board));
    }
    public int solution(int [][]board)
    {
        int answer = 1234;

        int[][] map = new int[board.length + 1][board[0].length + 1];

        int maxLen = 0;
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                if(board[i-1][j-1] != 0) {
                    int min = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]);
                    map[i][j] = min + 1;

                    maxLen = Math.max(maxLen, min + 1);
                }
            }
        }

        answer = maxLen * maxLen;
        return answer;
    }
}
