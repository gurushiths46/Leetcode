// Last updated: 15/07/2026, 12:07:34
1import java.util.Arrays;
2
3class Solution {
4    public int eraseOverlapIntervals(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
7
8        int count = 0;
9        int end = intervals[0][1];
10
11        for (int i = 1; i < intervals.length; i++) {
12            if (intervals[i][0] < end) {
13                count++;   // Remove current interval
14            } else {
15                end = intervals[i][1];
16            }
17        }
18
19        return count;
20    }
21} 