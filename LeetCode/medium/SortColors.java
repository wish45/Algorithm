package LeetCode.medium;

public class SortColors {
    public void sortColors(int[] nums) {
        int zeroC = 0;
        int lastInt = nums.length - 1;
        int tmp;
        int index = 0;

        while (zeroC <= lastInt) {
            if (nums[zeroC] == 0) {
                tmp = nums[zeroC];
                nums[zeroC] = nums[index];
                nums[index] = tmp;
                zeroC++;
                index++;
            } else if (nums[zeroC] == 2) {
                tmp = nums[zeroC];
                nums[zeroC] = nums[lastInt];
                nums[lastInt] = tmp;
                lastInt--;
            } else {
                zeroC++;
            }
        }
    }
}
