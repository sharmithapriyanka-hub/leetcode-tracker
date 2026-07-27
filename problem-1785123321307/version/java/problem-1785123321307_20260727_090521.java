// Last updated: 7/27/2026, 9:05:21 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode insertionSortList(ListNode head) {
17
18        if (head == null || head.next == null) {
19            return head;
20        }
21
22        // Dummy node for sorted list
23        ListNode dummy = new ListNode(0);
24
25        ListNode current = head;
26
27        while (current != null) {
28
29            // Save next node
30            ListNode next = current.next;
31
32            // Find correct position in sorted list
33            ListNode prev = dummy;
34
35            while (prev.next != null && prev.next.val < current.val) {
36                prev = prev.next;
37            }
38
39            // Insert current node
40            current.next = prev.next;
41            prev.next = current;
42
43            // Move to next node
44            current = next;
45        }
46
47        return dummy.next;
48    }
49}