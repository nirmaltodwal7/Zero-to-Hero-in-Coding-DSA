// Count Frequencies

// Input: nums = [1,1,2,2,3]
// Output: [[1,2],[2,2],[3,1]]
package day19;

import java.util.*;

class Solution {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }
        return ans;
    }
}