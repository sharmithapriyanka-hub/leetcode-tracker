// Last updated: 7/22/2026, 1:48:10 PM
1class Solution {
2
3    public int countNodes(TreeNode root) {
4        if (root == null)
5            return 0;
6
7        int leftHeight = leftDepth(root);
8        int rightHeight = rightDepth(root);
9
10        if (leftHeight == rightHeight) {
11            return (1 << leftHeight) - 1;
12        }
13
14        return 1 + countNodes(root.left) + countNodes(root.right);
15    }
16
17    private int leftDepth(TreeNode node) {
18        int height = 0;
19
20        while (node != null) {
21            height++;
22            node = node.left;
23        }
24
25        return height;
26    }
27
28    private int rightDepth(TreeNode node) {
29        int height = 0;
30
31        while (node != null) {
32            height++;
33            node = node.right;
34        }
35
36        return height;
37    }
38}