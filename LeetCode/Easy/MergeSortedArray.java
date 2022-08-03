package LeetCode.Easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1 = m - 1;
        int num2 = n - 1;
        int widIndex = nums1.length - 1;


        while (num1 >= 0 && num2 >= 0) {
            if (nums1[num1] >= nums2[num2]) {
                nums1[widIndex] = nums1[num1];
                widIndex--;
                num1--;
            } else {
                nums1[widIndex] = nums2[num2];
                widIndex--;
                num2--;
            }
        }

        while (num2 >= 0) {
            nums1[widIndex] = nums2[num2];
            widIndex--;
            num2--;
        }

    }
}
