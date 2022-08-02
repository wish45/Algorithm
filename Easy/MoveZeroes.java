package Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for(int index2=0; index2<nums.length; index2++){
            if(nums[index2] != 0 ){
                int tmp;
                tmp = nums[index];
                nums[index] = nums[index2];
                nums[index2] = tmp;
                index++;
            }
        }
    }
}
