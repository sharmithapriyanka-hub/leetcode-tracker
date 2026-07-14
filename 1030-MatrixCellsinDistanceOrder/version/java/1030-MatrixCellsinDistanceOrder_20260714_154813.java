// Last updated: 7/14/2026, 3:48:13 PM
1import java.util.*;
2
3class Solution {
4    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
5
6        int[][] result = new int[rows * cols][2];
7        int index = 0;
8        for (int i = 0; i < rows; i++) {
9            for (int j = 0; j < cols; j++) {
10                result[index][0] = i;
11                result[index][1] = j;
12                index++;
13            }
14        }
15        Arrays.sort(result, (a, b) ->
16            (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) -
17            (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))
18        );
19
20        return result;
21    }
22}