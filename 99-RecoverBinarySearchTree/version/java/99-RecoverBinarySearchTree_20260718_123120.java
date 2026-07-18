// Last updated: 7/18/2026, 12:31:20 PM
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
19    TreeNode first = null;
20    TreeNode second = null;
21    TreeNode prev = new TreeNode(Integer.MIN_VALUE);
22
23    public void recoverTree(TreeNode root) {
24        inorder(root);
25
26        int temp = first.val;
27        first.val = second.val;
28        second.val = temp;
29    }
30
31    private void inorder(TreeNode root) {
32        if (root == null)
33            return;
34
35        inorder(root.left);
36
37        if (prev.val > root.val) {
38            if (first == null)
39                first = prev;
40            second = root;
41        }
42
43        prev = root;
44
45        inorder(root.right);
46    }
47}