// Intersection of Two Arrays

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]

package day10;


import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set = new HashSet<>();
       for(int n2 : nums2){
        set.add(n2);
       } 
       ArrayList<Integer> list = new ArrayList<>();
       for(int n1: nums1){
           if(set.contains(n1)){
              list.add(n1);
              set.remove(n1);
            }
        }
       int res[] = new int[list.size()];
       for(int i=0; i<list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}