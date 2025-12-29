class Solution {
    public int[] runningSum(int[] nums) {
        // ps - prefix sum
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            ps[i] = ps[i-1] + nums[i];
        }
        return ps;
    }
}