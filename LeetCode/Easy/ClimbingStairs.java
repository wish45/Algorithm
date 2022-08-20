package LeetCode.Easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] arrays = new int[n + 1];

        arrays[0] = 1;
        arrays[1] = 1;

        for (int i = 2; i <= n; i++) {
            arrays[i] = arrays[i - 1] + arrays[i - 2];
        }

        return arrays[n];

    }
}

