package LeetCode.medium;

public class RotateImage {
    public static void main(String args[]){
        RotateImage asd = new RotateImage();
        int[][] nums = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        asd.rotate(nums);

    }
    public void rotate(int[][] matrix) {
       /* 새로운 배열 할당받으면 통과안됨.
       int length = matrix.length;

        int[][] ret = new int[length][length];
        int k = length-1;

        for(int i=0; i<length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println(matrix[i][j]);
                ret[j][k] = matrix[i][j];
            }
            k--;
        }
        matrix = ret;*/

        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int t = matrix[i][j];

                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = t;
            }
        }
    }
}




