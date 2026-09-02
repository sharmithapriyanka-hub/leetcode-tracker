// Last updated: 9/2/2026, 4:20:44 PM
1import java.util.*;
2
3class Solution {
4    public int lengthOfLIS(int[] nums) {
5        int n = nums.length;
6        int[] dp = new int[n];
7
8        Arrays.fill(dp, 1);
9
10        int maxLength = 1;
11
12        for (int i = 1; i < n; i++) {
13            for (int j = 0; j < i; j++) {
14                if (nums[i] > nums[j]) {
15                    dp[i] = Math.max(dp[i], dp[j] + 1);
16                }
17            }
18
19            maxLength = Math.max(maxLength, dp[i]);
20        }
21
22        return maxLength;
23    }
24}