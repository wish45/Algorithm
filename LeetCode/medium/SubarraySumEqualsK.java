package LeetCode.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String args[]){
        SubarraySumEqualsK asd = new SubarraySumEqualsK();
        int[] nums = new int[]{2,1,3};
        System.out.println(asd.subarraySum(nums, 4));
    }
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            if (map.containsKey(cur - k)) {
                c += map.get(cur - k);
            }
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        return c;
    }
}
