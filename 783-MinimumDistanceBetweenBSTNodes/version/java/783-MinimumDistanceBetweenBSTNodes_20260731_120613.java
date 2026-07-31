// Last updated: 7/31/2026, 12:06:13 PM
1class Solution {
2
3    int min = Integer.MAX_VALUE;
4    TreeNode prev = null;
5
6    public int minDiffInBST(TreeNode root) {
7        inorder(root);
8        return min;
9    }
10
11    public void inorder(TreeNode root) {
12
13        if (root == null) {
14            return;
15        }
16
17        inorder(root.left);
18
19        if (prev != null) {
20            min = Math.min(min, root.val - prev.val);
21        }
22
23        prev = root;
24
25        inorder(root.right);
26    }
27}