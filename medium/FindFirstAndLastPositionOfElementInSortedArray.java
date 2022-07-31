package medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[2];
        ret[0] = min(nums, target);
        ret[1] = max(nums, target);
        return ret;
    }

    public int min(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) { //오른쪽 순회해야댐
                right = mid - 1;
            } else {
                left = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;

    }

    public int max(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) { //왼쪽 순회해야댐
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

}

