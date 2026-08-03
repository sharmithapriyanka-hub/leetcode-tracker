// Last updated: 8/3/2026, 10:59:08 AM
1public class Solution extends VersionControl {
2    public int firstBadVersion(int n) {
3
4        int left = 1;
5        int right = n;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (isBadVersion(mid)) {
12                right = mid;
13            } else {
14                left = mid + 1;
15            }
16        }
17
18        return left;
19    }
20}