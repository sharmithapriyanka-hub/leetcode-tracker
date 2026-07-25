// Last updated: 7/25/2026, 9:02:37 AM
1class Solution {
2    public int binaryGap(int n) {
3
4        String binary = Integer.toBinaryString(n);
5
6        int last = -1;
7        int max = 0;
8
9        for (int i = 0; i < binary.length(); i++) {
10
11            if (binary.charAt(i) == '1') {
12
13                if (last != -1) {
14                    max = Math.max(max, i - last);
15                }
16
17                last = i;
18            }
19        }
20
21        return max;
22    }
23}