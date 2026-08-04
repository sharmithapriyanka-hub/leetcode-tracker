// Last updated: 8/4/2026, 10:02:07 AM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder ans = new StringBuilder();
4
5        for (String word : words) {
6            int sum = 0;
7
8            for (char ch : word.toCharArray()) {
9                sum += weights[ch - 'a'];
10            }
11
12            int mod = sum % 26;
13            ans.append((char) ('z' - mod));
14        }
15
16        return ans.toString();
17    }
18}