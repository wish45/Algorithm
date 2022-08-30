package LeetCode.medium;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        int[] maxdp = new int[nums.length];
        int[] mindp = new int[nums.length];

        maxdp[0] = nums[0];
        mindp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxdp[i] = Math.max(Math.max(nums[i] * maxdp[i - 1], nums[i] * mindp[i - 1]), nums[i]);
            mindp[i] = Math.min(Math.min(nums[i] * mindp[i - 1], nums[i] * mindp[i - 1]), nums[i]);

            if (maxdp[i] > max) {
                max = maxdp[i];
            }
        }

        return max;
    }
}
