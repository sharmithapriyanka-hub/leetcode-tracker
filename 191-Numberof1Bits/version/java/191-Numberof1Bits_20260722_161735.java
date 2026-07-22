// Last updated: 7/22/2026, 4:17:35 PM
1class Solution {
2    public int hammingWeight(int n) {
3
4        int count = 0;
5
6        while (n != 0) {
7            n = n & (n - 1);
8            count++;
9        }
10
11        return count;
12    }
13}