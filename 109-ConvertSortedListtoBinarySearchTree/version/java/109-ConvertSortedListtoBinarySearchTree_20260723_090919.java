// Last updated: 7/23/2026, 9:09:19 AM
1class Solution {
2
3    public TreeNode sortedListToBST(ListNode head) {
4        if (head == null)
5            return null;
6
7        return build(head, null);
8    }
9
10    private TreeNode build(ListNode start, ListNode end) {
11
12        if (start == end)
13            return null;
14
15        ListNode slow = start;
16        ListNode fast = start;
17
18        while (fast != end && fast.next != end) {
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22
23        TreeNode root = new TreeNode(slow.val);
24
25        root.left = build(start, slow);
26        root.right = build(slow.next, end);
27
28        return root;
29    }
30}