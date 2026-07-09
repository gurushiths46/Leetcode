// Last updated: 09/07/2026, 17:19:50
1public class Solution {
2    public int reverseBits(int n) {
3
4        int result = 0;
5
6        for (int i = 0; i < 32; i++) {
7
8            // Shift result left to make room for next bit
9            result <<= 1;
10
11            // Copy the last bit of n
12            result |= (n & 1);
13
14            // Unsigned right shift n
15            n >>>= 1;
16        }
17
18        return result;
19    }
20}