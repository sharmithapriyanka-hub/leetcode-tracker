// Last updated: 10/1/2026, 8:57:57 AM
1class BSTIterator {
2
3    Stack<TreeNode> stack = new Stack<>();
4
5    public BSTIterator(TreeNode root) {
6        pushLeft(root);
7    }
8
9    public int next() {
10        TreeNode current = stack.pop();
11
12        if (current.right != null) {
13            pushLeft(current.right);
14        }
15
16        return current.val;
17    }
18
19    public boolean hasNext() {
20        return !stack.isEmpty();
21    }
22
23    public void pushLeft(TreeNode root) {
24        while (root != null) {
25            stack.push(root);
26            root = root.left;
27        }
28    }
29}