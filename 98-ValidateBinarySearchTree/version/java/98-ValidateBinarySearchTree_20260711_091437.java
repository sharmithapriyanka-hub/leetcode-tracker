// Last updated: 7/11/2026, 9:14:37 AM
1class Solution {
2    public boolean isValidBST(TreeNode root) {
3        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
4    }
5
6    private boolean check(TreeNode node, long min, long max) {
7        if (node == null) return true;
8
9        if (node.val <= min || node.val >= max) return false;
10
11        return check(node.left, min, node.val) &&
12               check(node.right, node.val, max);
13    }
14}