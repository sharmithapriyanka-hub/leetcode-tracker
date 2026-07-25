// Last updated: 7/25/2026, 11:25:06 AM
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
16
17class Solution {
18
19    public boolean isUnivalTree(TreeNode root) {
20        return check(root, root.val);
21    }
22
23    public boolean check(TreeNode node, int value) {
24        if (node == null) {
25            return true;
26        }
27
28        if (node.val != value) {
29            return false;
30        }
31
32        return check(node.left, value) && check(node.right, value);
33    }
34}