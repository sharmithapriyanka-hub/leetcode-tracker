// Last updated: 7/27/2026, 12:23:20 PM
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
18    public int sumOfLeftLeaves(TreeNode root) {
19        if (root == null) {
20            return 0;
21        }
22
23        int sum = 0;
24
25        // Check if left child is a leaf
26        if (root.left != null &&
27            root.left.left == null &&
28            root.left.right == null) {
29
30            sum += root.left.val;
31        }
32
33        // Recur for left and right subtrees
34        sum += sumOfLeftLeaves(root.left);
35        sum += sumOfLeftLeaves(root.right);
36
37        return sum;
38    }
39}