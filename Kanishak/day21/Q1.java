//  Find the Index of the First Occurrence in a String

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

package day21;

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}