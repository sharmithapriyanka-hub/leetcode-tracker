// Last updated: 8/11/2026, 8:55:20 AM
1class Solution {
2    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
3
4        List<List<Integer>> result = new ArrayList<>();
5
6        if (root == null) {
7            return result;
8        }
9
10        Queue<TreeNode> queue = new LinkedList<>();
11        queue.add(root);
12
13        boolean leftToRight = true;
14
15        while (!queue.isEmpty()) {
16
17            int size = queue.size();
18            List<Integer> level = new ArrayList<>();
19
20            for (int i = 0; i < size; i++) {
21
22                TreeNode node = queue.poll();
23
24                if (leftToRight) {
25                    level.add(node.val);
26                } else {
27                    level.add(0, node.val);
28                }
29
30                if (node.left != null) {
31                    queue.add(node.left);
32                }
33
34                if (node.right != null) {
35                    queue.add(node.right);
36                }
37            }
38
39            result.add(level);
40
41            leftToRight = !leftToRight;
42        }
43
44        return result;
45    }
46}