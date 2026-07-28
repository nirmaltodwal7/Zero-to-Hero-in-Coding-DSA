// Maximum Subarray

// Kadane’s Algorithm

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currSum = Math.max(nums[i], currSum + nums[i]);

            
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}

// for kadnes use the following logic:

// 1. Initialize two variables, currSum and maxSum, to the first element of the input array nums.

// 2. Iterate through the array starting from the second element (index 1).

// 3. For each element nums[i], update currSum to be the maximum of nums[i] and currSum + nums[i]. This step determines whether to include the current element in the existing subarray or start a new subarray with the current element.

// 4. Update maxSum to be the maximum of maxSum and currSum. This step keeps track of the maximum sum encountered so far.

// 5. After iterating through the entire array, return maxSum, which represents the largest sum of any contiguous subarray found in nums.