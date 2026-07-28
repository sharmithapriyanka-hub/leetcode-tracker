// Last updated: 7/28/2026, 2:28:09 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> countStack = new Stack<>();
4        Stack<StringBuilder> stringStack = new Stack<>();
5
6        StringBuilder current = new StringBuilder();
7        int k = 0;
8
9        for (char ch : s.toCharArray()) {
10
11            if (Character.isDigit(ch)) {
12                k = k * 10 + (ch - '0');
13            }
14            else if (ch == '[') {
15                countStack.push(k);
16                stringStack.push(current);
17
18                current = new StringBuilder();
19                k = 0;
20            }
21            else if (ch == ']') {
22                int repeat = countStack.pop();
23                StringBuilder prev = stringStack.pop();
24
25                for (int i = 0; i < repeat; i++) {
26                    prev.append(current);
27                }
28
29                current = prev;
30            }
31            else {
32                current.append(ch);
33            }
34        }
35
36        return current.toString();
37    }
38}