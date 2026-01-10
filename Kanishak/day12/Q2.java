// Finding Pairs With a Certain Sum

package day12;


import java.util.*;
class FindSumPairs {

    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freq;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freq = new HashMap<>();
        for (int num : nums2) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = nums2[index];

        freq.put(oldVal, freq.get(oldVal) - 1);
        if (freq.get(oldVal) == 0) {
            freq.remove(oldVal);
        }

        nums2[index] += val;
        freq.put(nums2[index], freq.getOrDefault(nums2[index], 0) + 1);
    }
    
    public int count(int tot) {
        int result = 0;

        for (int num : nums1) {
            int target = tot - num;
            result += freq.getOrDefault(target, 0);
        }

        return result;

    }
}