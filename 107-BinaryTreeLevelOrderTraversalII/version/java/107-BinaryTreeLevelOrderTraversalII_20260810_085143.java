// Last updated: 8/10/2026, 8:51:43 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> levelOrderBottom(TreeNode root) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        if (root == null) {
9            return result;
10        }
11
12        Queue<TreeNode> queue = new LinkedList<>();
13        queue.add(root);
14
15        while (!queue.isEmpty()) {
16
17            int size = queue.size();
18            List<Integer> level = new ArrayList<>();
19
20            for (int i = 0; i < size; i++) {
21
22                TreeNode node = queue.poll();
23                level.add(node.val);
24
25                if (node.left != null) {
26                    queue.add(node.left);
27                }
28
29                if (node.right != null) {
30                    queue.add(node.right);
31                }
32            }
33
34            
35            result.add(0, level);
36        }
37
38        return result;
39    }
40}