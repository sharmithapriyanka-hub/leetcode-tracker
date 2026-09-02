// Last updated: 9/2/2026, 10:12:15 AM
1class Solution {
2    public int trailingZeroes(int n) {
3        int count = 0;
4
5        while (n > 0) {
6            n /= 5;
7            count += n;
8        }
9
10        return count;
11    }
12}