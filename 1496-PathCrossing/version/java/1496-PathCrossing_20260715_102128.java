// Last updated: 7/15/2026, 10:21:28 AM
1import java.util.*;
2
3class Solution {
4    public boolean isPathCrossing(String path) {
5        Set<String> visited = new HashSet<>();
6
7        int x = 0, y = 0;
8        visited.add("0,0");
9
10        for (char ch : path.toCharArray()) {
11            if (ch == 'N') y++;
12            else if (ch == 'S') y--;
13            else if (ch == 'E') x++;
14            else x--;
15
16            String pos = x + "," + y;
17
18            if (visited.contains(pos))
19                return true;
20
21            visited.add(pos);
22        }
23
24        return false;
25    }
26}