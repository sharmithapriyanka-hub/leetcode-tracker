// Last updated: 7/9/2026, 9:50:11 AM
class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        
    
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}