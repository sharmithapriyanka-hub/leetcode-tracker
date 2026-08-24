// Last updated: 8/24/2026, 11:17:00 AM
1class Solution {
2    public String clearDigits(String s) {
3        StringBuilder stack = new StringBuilder();
4
5        for (char ch : s.toCharArray()) {
6            if (Character.isDigit(ch)) {
7                if (stack.length() > 0) {
8                    stack.deleteCharAt(stack.length() - 1);
9                }
10            } else {
11                stack.append(ch);
12            }
13        }
14
15        return stack.toString();
16    }
17}