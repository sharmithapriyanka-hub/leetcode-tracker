// Last updated: 7/28/2026, 9:20:32 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        if (grid == null || grid.length == 0) {
4            return 0;
5        }
6
7        int count = 0;
8        int rows = grid.length;
9        int cols = grid[0].length;
10
11        for (int i = 0; i < rows; i++) {
12            for (int j = 0; j < cols; j++) {
13                if (grid[i][j] == '1') {
14                    count++;
15                    dfs(grid, i, j);
16                }
17            }
18        }
19
20        return count;
21    }
22
23    private void dfs(char[][] grid, int i, int j) {
24        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
25            return;
26        }
27
28        grid[i][j] = '0'; 
29
30        dfs(grid, i + 1, j); 
31        dfs(grid, i - 1, j); 
32        dfs(grid, i, j + 1); 
33        dfs(grid, i, j - 1);
34    }
35}