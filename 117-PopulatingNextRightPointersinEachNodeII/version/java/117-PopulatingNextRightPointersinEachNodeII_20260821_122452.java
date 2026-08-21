// Last updated: 8/21/2026, 12:24:52 PM
1class Solution {
2    public Node connect(Node root) {
3        if (root == null) {
4            return null;
5        }
6
7        Node current = root;
8
9        while (current != null) {
10
11            Node nextHead = null;
12            Node prev = null;
13
14            while (current != null) {
15                if (current.left != null) {
16                    if (nextHead == null) {
17                        nextHead = current.left;
18                    }
19
20                    if (prev != null) {
21                        prev.next = current.left;
22                    }
23
24                    prev = current.left;
25                }
26
27    
28                if (current.right != null) {
29                    if (nextHead == null) {
30                        nextHead = current.right;
31                    }
32
33                    if (prev != null) {
34                        prev.next = current.right;
35                    }
36
37                    prev = current.right;
38                }
39
40    
41                current = current.next;
42            }
43
44        
45            current = nextHead;
46        }
47
48        return root;
49    }
50}