// Last updated: 15/07/2026, 12:08:28
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDuplicates(int[] nums) {
5
6        HashSet<Integer> set = new HashSet<>();
7        List<Integer> ans = new ArrayList<>();
8
9        for (int num : nums) {
10            if (set.contains(num))
11                ans.add(num);
12            else
13                set.add(num);
14        }
15
16        return ans;
17    }
18}