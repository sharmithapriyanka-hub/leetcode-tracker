// Last updated: 7/9/2026, 1:44:52 PM
1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        int m = matrix.length, n = matrix[0].length;
4
5        for (int i = 1; i < m; i++) {
6            for (int j = 1; j < n; j++) {
7                if (matrix[i][j] != matrix[i - 1][j - 1]) {
8                    return false;
9                }
10            }
11        }
12
13        return true;
14    }
15}