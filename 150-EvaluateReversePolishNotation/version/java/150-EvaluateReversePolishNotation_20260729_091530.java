// Last updated: 7/29/2026, 9:15:30 AM
1import java.util.*;
2
3class Solution {
4    public int evalRPN(String[] tokens) {
5        Stack<Integer> stack = new Stack<>();
6
7        for (String token : tokens) {
8            switch (token) {
9                case "+":
10                    stack.push(stack.pop() + stack.pop());
11                    break;
12
13                case "-":
14                    int b = stack.pop();
15                    int a = stack.pop();
16                    stack.push(a - b);
17                    break;
18
19                case "*":
20                    stack.push(stack.pop() * stack.pop());
21                    break;
22
23                case "/":
24                    b = stack.pop();
25                    a = stack.pop();
26                    stack.push(a / b);
27                    break;
28
29                default:
30                    stack.push(Integer.parseInt(token));
31            }
32        }
33
34        return stack.pop();
35    }
36}