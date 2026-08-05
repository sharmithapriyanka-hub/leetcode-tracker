// Last updated: 8/5/2026, 9:49:14 AM
1import java.util.*;
2
3class Solution {
4
5    public String fractionToDecimal(int numerator, int denominator) {
6
7        if (numerator == 0)
8            return "0";
9
10        StringBuilder ans = new StringBuilder();
11
12        
13        if ((numerator < 0) ^ (denominator < 0))
14            ans.append("-");
15
16        long num = Math.abs((long) numerator);
17        long den = Math.abs((long) denominator);
18
19        // Integer part
20        ans.append(num / den);
21
22        long rem = num % den;
23
24        if (rem == 0)
25            return ans.toString();
26
27        ans.append(".");
28
29        HashMap<Long, Integer> map = new HashMap<>();
30
31        while (rem != 0) {
32
33            if (map.containsKey(rem)) {
34
35                ans.insert(map.get(rem), "(");
36                ans.append(")");
37
38                break;
39            }
40
41            map.put(rem, ans.length());
42
43            rem *= 10;
44
45            ans.append(rem / den);
46
47            rem %= den;
48        }
49
50        return ans.toString();
51    }
52}