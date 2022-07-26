package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
        int length = nums.length;
        int j,k;

        for(int i=0; i<length; i++)
        {
            if(i==0 || nums[i]!=nums[i-1]){
                j=i+1;
                k=length-1;
                while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> out = new ArrayList<Integer>();
                        out.add(nums[i]);
                        out.add(nums[j]);
                        out.add(nums[k]);
                        ret.add(out);
                        j++;
                        k--;
                        while(j<length-1 && nums[j]==nums[j-1]){
                            j++;
                        }
                        while(k>j && nums[k]==nums[k+1]){
                            k--;
                        }
                    }else if(nums[i]+nums[j]+nums[k]>0){
                        k--;
                    }else{
                        j++;
                    }
                }
            }

        }



        return ret;

    }
   /* 시간초과
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
        int length = nums.length;

        for(int i=0; i<length-2; i++){
            for (int j=i+1; j<length-1; j++){
                for( int k=j+1; k<length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> out = new ArrayList<Integer>();
                        out.add(nums[i]);
                        out.add(nums[j]);
                        out.add(nums[k]);
                        boolean isDuplicated = false;
                        for(List<Integer> prev : ret){
                            if(prev.get(0)==out.get(0) && prev.get(1)==out.get(1) &&
                              prev.get(2)==out.get(2)){
                                isDuplicated = true;
                                break;
                            }
                        }
                        if(!isDuplicated){
                            ret.add(out);
                        }
                    }
                }
            }
        }
        return ret;
    }
    */
}
