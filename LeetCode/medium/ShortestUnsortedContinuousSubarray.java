package LeetCode.medium;

public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        //O(n)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                min = Math.min(min, nums[i]);
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
            }
        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            return 0;
        }

        int endPos = 0;
        int startPos = 0;

        for (int start = 0; start < n; start++) {
            if (nums[start] > min) {
                startPos = start;
                break;
            }
        }

        for (int end = n - 1; end >= 0; end--) {
            if (nums[end] < max) {
                endPos = end;
                break;
            }
        }
        return endPos - startPos + 1;
    }
}
