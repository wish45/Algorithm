package LeetCode.medium;

public class MinimumPathSum {
    public static void main(String args[]){
        MinimumPathSum asd = new MinimumPathSum();
        int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(asd.minPathSum(grid));
    }

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }

        int r = grid.length;
        int c = grid[0].length;
        //3x3
        int[][] dp = new int[r][c];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < r; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < c; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[r - 1][c - 1];
    }
}
