// Last updated: 7/22/2026, 4:20:45 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3
4        if (n <= 0)
5            return false;
6
7        return (n & (n - 1)) == 0;
8    }
9}