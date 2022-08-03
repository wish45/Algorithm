package LeetCode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> out = new ArrayList<>();
        int[] cur = intervals[0];
        out.add(cur);

        for (int[] interval : intervals) {
            int cur_start = cur[0];
            int cur_end = cur[1];
            int next_start = interval[0];
            int next_end = interval[1];

            if (cur_end >= next_start) {
                cur[1] = Math.max(cur_end, next_end);

            } else {
                cur = interval;
                out.add(cur);
            }
        }

        return out.toArray(new int[out.size()][]);
    }
}
