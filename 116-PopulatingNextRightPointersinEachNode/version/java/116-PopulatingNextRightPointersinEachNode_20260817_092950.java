// Last updated: 8/17/2026, 9:29:50 AM
1class Solution {
2    public Node connect(Node root) {
3        if (root == null) {
4            return null;
5        }
6
7        Node leftmost = root;
8
9        while (leftmost.left != null) {
10            Node current = leftmost;
11
12            while (current != null) {
13                
14                current.left.next = current.right;
15
16                // Connect right child to next node's left child
17                if (current.next != null) {
18                    current.right.next = current.next.left;
19                }
20
21                current = current.next;
22            }
23
24            
25            leftmost = leftmost.left;
26        }
27
28        return root;
29    }
30}