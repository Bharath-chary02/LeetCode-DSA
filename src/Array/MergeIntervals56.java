package Array;
import java.util.*;

public class MergeIntervals56 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        Solution sol = new Solution();

        int[][] result = sol.merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

class Solution {
    // ---------------------------------------------
    // Approach 1: Sorting + Merge
    // Time: O(n log n)
    // Space: O(n)
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                res.add(new int[]{start, end});
                start = currStart;
                end = currEnd;
            }
        }
        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][]);
    }
}