package level1;

public class sosu {
    public static void main(String args[]) {
        int[] nums = new int[]{1, 2, 7, 6, 4};
        int ret = 0;
        int answ = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = nums.length - 1;
                while (j < k) {
                    ret = 0;
                    int max = nums[i] + nums[j] + nums[k];
                    for (int l = 1; l <= max; l++) {
                        if (max % l == 0) {
                            ret += 1;
                        }
                    }
                    if (ret == 2) {
                        answ += 1;
                    }
                    k--;
                }

            }
        }
    }
}
