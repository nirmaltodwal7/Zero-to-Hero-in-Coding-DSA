// Jump Game 

// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 
package day11;

class Solution {
    public boolean canJump(int[] nums) {
        int lastpos = nums.length-1;
        for(int i = nums.length-2; i>=0; i--)
        {
            if(i+nums[i]>=lastpos)
            {
                lastpos = i;
            }
        }
        return lastpos == 0;
    }
}