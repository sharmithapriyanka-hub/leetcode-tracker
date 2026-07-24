// Last updated: 7/24/2026, 10:12:16 AM
1public class Solution extends GuessGame {
2    public int guessNumber(int n) {
3        int low = 1;
4        int high = n;
5
6        while (low <= high) {
7            int mid = low + (high - low) / 2;
8
9            int result = guess(mid);
10
11            if (result == 0) {
12                return mid;
13            } else if (result == -1) {
14                high = mid - 1;
15            } else {
16                low = mid + 1;
17            }
18        }
19
20        return -1;
21    }
22}