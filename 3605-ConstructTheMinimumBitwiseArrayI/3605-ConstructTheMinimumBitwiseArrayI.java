// Last updated: 7/9/2026, 9:50:14 AM
import java.util.*;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            int num = nums.get(i);
            ans[i] = -1; 
    
            for(int x = 0; x < num; x++){
                if((x | (x + 1)) == num){
                    ans[i] = x;
                    break;
                }
            }
        }
        
        return ans;
    }
    
    
    public static void main(String[] args){
        Solution sol = new Solution();
        List<Integer> nums = Arrays.asList(2, 3, 5, 7);
        int[] res = sol.minBitwiseArray(nums);
        System.out.println(Arrays.toString(res)); // [-1, 1, 4, 3]
    }
}
