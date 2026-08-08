// Last updated: 8/8/2026, 8:59:12 AM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        return Integer.bitCount(x ^ y);
4    }
5}