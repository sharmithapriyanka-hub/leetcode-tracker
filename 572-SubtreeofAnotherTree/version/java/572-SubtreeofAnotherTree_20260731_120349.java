// Last updated: 7/31/2026, 12:03:49 PM
1class Solution {
2
3    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
4
5        if (root == null) {
6            return false;
7        }
8
9        if (isSame(root, subRoot)) {
10            return true;
11        }
12
13        return isSubtree(root.left, subRoot) ||
14               isSubtree(root.right, subRoot);
15    }
16
17    public boolean isSame(TreeNode p, TreeNode q) {
18
19        if (p == null && q == null) {
20            return true;
21        }
22
23        if (p == null || q == null) {
24            return false;
25        }
26
27        if (p.val != q.val) {
28            return false;
29        }
30
31        return isSame(p.left, q.left) &&
32               isSame(p.right, q.right);
33    }
34}