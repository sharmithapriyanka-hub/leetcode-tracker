// Last updated: 7/27/2026, 12:16:22 PM
1import java.util.Stack;
2
3class MyQueue {
4
5    Stack<Integer> input;
6    Stack<Integer> output;
7
8    public MyQueue() {
9        input = new Stack<>();
10        output = new Stack<>();
11    }
12
13    public void push(int x) {
14        input.push(x);
15    }
16
17    public int pop() {
18        peek();
19        return output.pop();
20    }
21
22    public int peek() {
23        if (output.isEmpty()) {
24            while (!input.isEmpty()) {
25                output.push(input.pop());
26            }
27        }
28        return output.peek();
29    }
30
31    public boolean empty() {
32        return input.isEmpty() && output.isEmpty();
33    }
34}