// Last updated: 8/7/2026, 4:02:04 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    TreeNode prev = null;
19
20    public void flatten(TreeNode root) {
21        if (root == null) {
22            return;
23        }
24
25        flatten(root.right);
26        flatten(root.left);
27
28        root.right = prev;
29        root.left = null;
30        prev = root;
31    }
32}