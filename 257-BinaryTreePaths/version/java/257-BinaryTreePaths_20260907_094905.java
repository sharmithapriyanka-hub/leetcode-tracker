// Last updated: 9/7/2026, 9:49:05 AM
1class Solution {
2    public List<String> binaryTreePaths(TreeNode root) {
3        List<String> result = new ArrayList<>();
4        findPaths(root, "", result);
5        return result;
6    }
7
8    void findPaths(TreeNode node, String path, List<String> result) {
9        if (node == null) {
10            return;
11        }
12
13        if (path.equals("")) {
14            path = "" + node.val;
15        } else {
16            path = path + "->" + node.val;
17        }
18
19        if (node.left == null && node.right == null) {
20            result.add(path);
21            return;
22        }
23
24        findPaths(node.left, path, result);
25        findPaths(node.right, path, result);
26    }
27}