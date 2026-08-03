// Last updated: 8/3/2026, 9:46:19 AM
1import java.util.*;
2
3class Solution {
4    public List<String> readBinaryWatch(int turnedOn) {
5        List<String> ans = new ArrayList<>();
6
7        for (int hour = 0; hour < 12; hour++) {
8            for (int minute = 0; minute < 60; minute++) {
9
10                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
11
12                    String time = hour + ":";
13
14                    if (minute < 10)
15                        time += "0" + minute;
16                    else
17                        time += minute;
18
19                    ans.add(time);
20                }
21            }
22        }
23
24        return ans;
25    }
26}