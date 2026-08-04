// Last updated: 8/4/2026, 2:41:54 PM
1class Solution {
2    int diameter = 0;
3
4    public int diameterOfBinaryTree(TreeNode root) {
5        height(root);
6        return diameter;
7    }
8
9    private int height(TreeNode node) {
10        if (node == null) {
11            return 0;
12        }
13
14        int leftHeight = height(node.left);
15        int rightHeight = height(node.right);
16
17    
18        diameter = Math.max(diameter, leftHeight + rightHeight);
19
20    
21        return 1 + Math.max(leftHeight, rightHeight);
22    }
23}