package LeetCode.medium;

public class FindPeakElement {
    /*이웃 숫자보다 큰 숫자의 인덱스를 리턴*/
    public int findPeakElement(int[] nums) {
        //binary search O(log N)

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
