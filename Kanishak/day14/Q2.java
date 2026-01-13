// Valid Anagram

package day14;


// Input: s = "anagram", t = "nagaram"

// Output: true


class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();

        if(sl != tl){
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            arr[t.charAt(i) - 'a']--;

            if(arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
