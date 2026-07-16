// Last updated: 7/16/2026, 9:20:57 AM
1import java.util.*;
2
3class Solution {
4    public int[] relativeSortArray(int[] arr1, int[] arr2) {
5        Map<Integer, Integer> map = new HashMap<>();
6
7        
8        for (int num : arr1) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11
12        int[] result = new int[arr1.length];
13        int index = 0;
14
15        for (int num : arr2) {
16            while (map.get(num) > 0) {
17                result[index++] = num;
18                map.put(num, map.get(num) - 1);
19            }
20        }
21
22       
23        List<Integer> remaining = new ArrayList<>();
24        for (int num : map.keySet()) {
25            while (map.get(num) > 0) {
26                remaining.add(num);
27                map.put(num, map.get(num) - 1);
28            }
29        }
30
31   
32        Collections.sort(remaining);
33
34        
35        for (int num : remaining) {
36            result[index++] = num;
37        }
38
39        return result;
40    }
41}