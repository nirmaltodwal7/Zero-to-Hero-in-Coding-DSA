// 

package day19;

// Input: s = "the sky is blue"
// Output: "blue is sky the"

class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) break;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            result.append(s.substring(i + 1, j + 1));
            result.append(' ');
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}