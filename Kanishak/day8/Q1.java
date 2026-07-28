// Next Permutation

// Input: nums = [1,2,3]
// Output: [1,3,2]
package day8;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}

// Implementation of the next permutation algorithm:

// 1. Start from the end of the array and find the first pair of consecutive elements (nums[i], nums[i + 1]) such that nums[i] < nums[i + 1]. This identifies the pivot point where the next permutation can be generated.
// Pivot dhoondo (Right se)

// 2. If such a pair is found (i >= 0), find the smallest element in the suffix (the part of the array after index i) that is greater than nums[i]. This element will be swapped with nums[i] to create the next permutation.
// Pivot se just bada element dhoondo
// 3. Swap the elements nums[i] and nums[j] to create a new permutation.
// swap karo
// 4. Finally, reverse the suffix (the part of the array after index i) to get the smallest lexicographical order for that part of the array, ensuring that the next permutation is generated correctly.
// Suffix ko reverse karo