package LeetCode.medium;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int ans[] = new int[k];
        List<Map.Entry<Integer, Integer>> l = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        for (int i = 0; i < k; i++) {
            ans[i] = l.get(i).getKey();
        }
        return ans;
    }
}
