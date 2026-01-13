// Reverse String

package day13;

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]


class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n-1;
        while(left<right){

            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;

            left++;
            right--;
        }
    }
}