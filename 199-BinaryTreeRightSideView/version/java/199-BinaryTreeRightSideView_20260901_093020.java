// Last updated: 9/1/2026, 9:30:20 AM
1class Solution {
2    public List<Integer> rightSideView(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5
6        if (root == null) {
7            return result;
8        }
9
10        Queue<TreeNode> queue = new LinkedList<>();
11        queue.offer(root);
12
13        while (!queue.isEmpty()) {
14
15            int size = queue.size();
16
17            for (int i = 0; i < size; i++) {
18
19                TreeNode current = queue.poll();
20
21                // Last node of this level
22                if (i == size - 1) {
23                    result.add(current.val);
24                }
25
26                if (current.left != null) {
27                    queue.offer(current.left);
28                }
29
30                if (current.right != null) {
31                    queue.offer(current.right);
32                }
33            }
34        }
35
36        return result;
37    }
38}