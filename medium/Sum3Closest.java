package medium;

import java.util.Arrays;

public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int compare = Integer.MAX_VALUE; //일단 가장 큰 수를 저장.
        int ret = 0;
        int j,k;

        Arrays.sort(nums);

        for(int i=0; i<length; i++){
            j = i+1;
            k = length-1;
            while(j<k){
                int value = Math.abs((nums[i]+ nums[j]+nums[k])-target);
                if(value<compare){
                    compare = value;
                    ret = nums[i]+nums[j]+nums[k];
                    if(ret<target){
                        j++;
                    }else{
                        k--;
                    }
                }else if(nums[i]+nums[j]+nums[k]<target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return ret;
    }
}
