// Last updated: 7/17/2026, 12:13:48 PM
1import java.util.*;
2
3class Solution {
4    public int[] gcdValues(int[] nums, long[] queries) {
5        int max = 0;
6        for (int x : nums) max = Math.max(max, x);
7
8        int[] freq = new int[max + 1];
9        for (int x : nums) freq[x]++;
10
11        long[] divisible = new long[max + 1];
12
13        for (int i = 1; i <= max; i++) {
14            for (int j = i; j <= max; j += i) {
15                divisible[i] += freq[j];
16            }
17        }
18
19        long[] exact = new long[max + 1];
20
21        for (int i = max; i >= 1; i--) {
22            long cnt = divisible[i];
23            exact[i] = cnt * (cnt - 1) / 2;
24
25            for (int j = i * 2; j <= max; j += i) {
26                exact[i] -= exact[j];
27            }
28        }
29
30        long[] prefix = new long[max + 1];
31        for (int i = 1; i <= max; i++) {
32            prefix[i] = prefix[i - 1] + exact[i];
33        }
34
35        int[] ans = new int[queries.length];
36
37        for (int k = 0; k < queries.length; k++) {
38            long target = queries[k] + 1;
39            int l = 1, r = max;
40
41            while (l < r) {
42                int mid = l + (r - l) / 2;
43                if (prefix[mid] >= target)
44                    r = mid;
45                else
46                    l = mid + 1;
47            }
48            ans[k] = l;
49        }
50
51        return ans;
52    }
53}