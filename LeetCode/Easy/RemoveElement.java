package LeetCode.Easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[cnt++] = nums[i];
            }
        }
        return cnt;
    }
}
