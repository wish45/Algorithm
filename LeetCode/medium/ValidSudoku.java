package LeetCode.medium;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        //가로 , 세로 중복검사, 3x3중복검사
        boolean[][] rows = new boolean[10][10];
        boolean[][] columns = new boolean[10][10];
        boolean[][] boxs = new boolean[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int val = board[i][j] - '0';
                if (rows[i][val] == true) {
                    return false;
                }
                rows[i][val] = true;

                if (columns[j][val] == true) {
                    return false;
                }
                columns[j][val] = true;

                int x = i / 3;
                int y = j / 3;
                int k = 0;

                if (x == 0 && y == 0) {
                    k = 0;
                } else if (x == 0 && y == 1) {
                    k = 1;
                } else if (x == 0 && y == 2) {
                    k = 2;
                } else if (x == 1 && y == 0) {
                    k = 3;
                } else if (x == 1 && y == 1) {
                    k = 4;
                } else if (x == 1 && y == 2) {
                    k = 5;
                } else if (x == 2 && y == 0) {
                    k = 6;
                } else if (x == 2 && y == 1) {
                    k = 7;
                } else if (x == 2 && y == 2) {
                    k = 8;
                }

                if (boxs[k][val] == true) {
                    return false;
                }
                boxs[k][val] = true;
            }
        }

        return true;
    }
}
