// First Unique Character in a String

package day13;

// Input: s = "leetcode"

// Output: 0

// Explanation:

// The character 'l' at index 0 is the first character that does not occur at any other index.

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            freq[chars[i]-'a']++;
        }
        for(int i=0;i<chars.length;i++){
            if(freq[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}