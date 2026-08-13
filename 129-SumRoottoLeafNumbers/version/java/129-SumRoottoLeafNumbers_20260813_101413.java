// Last updated: 8/13/2026, 10:14:13 AM
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return dfs(root, 0);
4    }
5
6    private int dfs(TreeNode root, int current) {
7        if (root == null) {
8            return 0;
9        }
10
11        current = current * 10 + root.val;
12
13        // Leaf node
14        if (root.left == null && root.right == null) {
15            return current;
16        }
17
18        return dfs(root.left, current) + dfs(root.right, current);
19    }
20}