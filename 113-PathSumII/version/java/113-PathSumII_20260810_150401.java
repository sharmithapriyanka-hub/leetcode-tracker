// Last updated: 8/10/2026, 3:04:01 PM
1class Solution {
2
3    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
4        List<List<Integer>> result = new ArrayList<>();
5        List<Integer> path = new ArrayList<>();
6
7        findPaths(root, targetSum, path, result);
8
9        return result;
10    }
11
12    private void findPaths(TreeNode root, int targetSum,
13                           List<Integer> path,
14                           List<List<Integer>> result) {
15
16        if (root == null) {
17            return;
18        }
19
20    
21        path.add(root.val);
22
23        
24        if (root.left == null && root.right == null
25                && targetSum == root.val) {
26
27            result.add(new ArrayList<>(path));
28        }
29
30
31        findPaths(root.left, targetSum - root.val, path, result);
32
33        
34        findPaths(root.right, targetSum - root.val, path, result);
35
36
37        path.remove(path.size() - 1);
38    }
39}