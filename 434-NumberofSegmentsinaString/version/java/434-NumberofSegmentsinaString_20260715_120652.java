// Last updated: 15/07/2026, 12:06:52
1class Solution {
2    public int countSegments(String s) {
3        if (s == null || s.length() == 0)
4            return 0;
5
6        int count = 0;
7
8        for (int i = 0; i < s.length(); i++) {
9            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
10                count++;
11            }
12        }
13
14        return count;
15    }
16}