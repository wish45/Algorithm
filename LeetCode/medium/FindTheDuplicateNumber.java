package LeetCode.medium;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int length = nums.length;

        int[] al = new int[length];
        int ret = 0;

        for(int a=0; a<al.length; a++){
            al[a]=0;
        }

        for(int i=0; i<length; i++){
            al[nums[i]]++;

            if(al[nums[i]]>1){
                ret = nums[i];
            }
        }
        return ret;
    }
}

                                    