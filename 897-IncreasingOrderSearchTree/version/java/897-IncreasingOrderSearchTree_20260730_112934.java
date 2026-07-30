// Last updated: 7/30/2026, 11:29:34 AM
1class Solution {
2    TreeNode prev = null;
3    TreeNode newRoot = null;
4
5    public TreeNode increasingBST(TreeNode root) {
6        inorder(root);
7        return newRoot;
8    }
9
10    void inorder(TreeNode root) {
11        if (root == null) {
12            return;
13        }
14
15    
16        inorder(root.left);
17
18    
19        root.left = null;
20
21        if (newRoot == null) {
22            newRoot = root;
23        } else {
24            prev.right = root;
25        }
26
27        prev = root;
28
29        
30        inorder(root.right);
31    }
32}