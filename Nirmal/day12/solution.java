//2616. Minimize the Maximum Difference of Pairs//

class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = (low + high) / 2;

            if (canFormPairs(nums, p, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFormPairs(int[] nums, int p, int diff) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] <= diff) {
                count++;
                i++;
            }
        }

        return count >= p;
    }
}
