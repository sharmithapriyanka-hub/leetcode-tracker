// Last updated: 7/14/2026, 11:55:17 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> minimumAbsDifference(int[] arr) {
5        Arrays.sort(arr);
6
7        List<List<Integer>> ans = new ArrayList<>();
8
9        int minDiff = Integer.MAX_VALUE;
10
11        // Find minimum difference
12        for (int i = 1; i < arr.length; i++) {
13            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
14        }
15
16        // Add pairs with minimum difference
17        for (int i = 1; i < arr.length; i++) {
18            if (arr[i] - arr[i - 1] == minDiff) {
19                List<Integer> pair = new ArrayList<>();
20                pair.add(arr[i - 1]);
21                pair.add(arr[i]);
22                ans.add(pair);
23            }
24        }
25
26        return ans;
27    }
28}