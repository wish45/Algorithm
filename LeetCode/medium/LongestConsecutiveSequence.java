package LeetCode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String args[]){
        LongestConsecutiveSequence asd = new LongestConsecutiveSequence();
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        //int[] nums = new int[]{0,-1};
        System.out.println(asd.longestConsecutive(nums));
        
    }
    /*
    * 해당 솔루션은 마이너스 값에 대한 처리가 안되서 실패
    * */
   /* public int longestConsecutive(int[] nums) {
        int[] ret = new int[1024];
        int length = nums.length;
        int conseCnt = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            ret[nums[i]]++;
        }

        //for (int i = 0; i < length; i++) {
        //    System.out.println(ret[i]);
        //}

        for (int i = 0; i < ret.length; i++) {
            if (ret[i] >= 1) {
                conseCnt++;
            } else {
                if (max < conseCnt) {
                    max = conseCnt;
                }
                conseCnt = 0;
            }
        }

        return max;
    }*/

   /*
   * HashSet으로 중복제거
   * */
    public int longestConsecutive(int[] nums) {
        Set<Integer> nums_set = new HashSet<Integer>();
        int length = nums.length;
        int ret = 0;
        int max = 0;

        for(int i=0; i<length; i++){
            nums_set.add(nums[i]);
        }

        for(int i=0; i<length; i++){
            int prev = nums[i]-1;
            int next = nums[i]+1;
            int cnt = 0;

            while(nums_set.contains(prev)){
                cnt++;
                nums_set.remove(prev);
                if(nums_set.contains(prev-1)){
                    prev--;
                }
            }

            while(nums_set.contains(next)){
                cnt++;
                nums_set.remove(next);
                if(nums_set.contains(next+1)){
                    next++;
                }
            }
            max = cnt+1;
            ret = Math.max(max,ret);

        }
        return ret;
    }
}

