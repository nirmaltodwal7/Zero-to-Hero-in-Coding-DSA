// Sliding Window Maximum

// Example 1:

// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7
package day9;

import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int j = 0;
        ArrayDeque<Integer> queue = new ArrayDeque();
        for(int i = 0; i < nums.length; i++){
            while(!queue.isEmpty() && nums[queue.getLast()] < nums[i]){
                queue.removeLast();
            }
            queue.addLast(i);
            if(queue.getFirst() + k == i){
                queue.removeFirst();
            }
            if (i >= k - 1){
                res[j++] = nums[queue.getFirst()];
            }
        }
        return res;
    }
}