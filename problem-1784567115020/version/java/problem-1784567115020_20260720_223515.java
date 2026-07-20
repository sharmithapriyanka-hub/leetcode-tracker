// Last updated: 7/20/2026, 10:35:15 PM
1class Solution {
2    public int numTrees(int n) {
3        int[] dp = new int[n + 1];
4
5        dp[0] = 1;
6        dp[1] = 1;
7
8        for (int nodes = 2; nodes <= n; nodes++) {
9
10            for (int root = 1; root <= nodes; root++) {
11
12                int left = root - 1;
13                int right = nodes - root;
14
15                dp[nodes] += dp[left] * dp[right];
16            }
17        }
18
19        return dp[n];
20    }
21}