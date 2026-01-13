// GROUP ANAGRAMS

// Input: strs = ["eat","tea","tan","ate","nat","bat"]

// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

// Explanation:

// There is no string in strs that can be rearranged to form "bat".
// The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
// The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
package day14;


import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char charArray[] = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }
        return new LinkedList<>(map.values());
    }
}