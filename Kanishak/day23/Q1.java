// Find Minimum in Rotated Sorted Array
package day23;

// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;

        while(left < right) {
            int mid = left + (right -left)/2;

            if(nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}