// Last updated: 7/20/2026, 10:54:18 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] > nums[right]) {
10                left = mid + 1;
11            } else {
12                right = mid;
13            }
14        }
15
16        return nums[left];
17    }
18}