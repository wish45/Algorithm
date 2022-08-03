package LeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
        int length = nums.length;
        int k,l;

        for(int i=0; i<length-3;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                boolean isFirst = true;
                for(int j=i+1; j<length-2;j++){
                    if(isFirst || nums[j]!=nums[j-1]){
                        isFirst = false;
                        k=j+1;
                        l=length-1;
                        while(k<l){
                            if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                                List<Integer> out = new ArrayList<Integer>();
                                out.add(nums[i]);
                                out.add(nums[j]);
                                out.add(nums[k]);
                                out.add(nums[l]);
                                ret.add(out);
                                k++;
                                l--;
                                while(k<length-1 && nums[k]==nums[k-1]){
                                    k++;
                                }
                                while(l>k && nums[l]==nums[l+1]){
                                    l--;
                                }
                            }else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                                l--;
                            } else{
                                k++;
                            }
                        }
                    }
                }
            }

        }
        return ret;
    }
}
