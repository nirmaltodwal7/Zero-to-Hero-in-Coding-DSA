// Longest Happy Prefix
package day17;


// Input: s = "level"
// Output: "l"
// Explanation: s contains 4 prefix excluding itself ("l", "le", "lev", "leve"), and suffix ("l", "el", "vel", "evel"). The largest prefix which is also suffix is given by "l".

class Solution {
    public String longestPrefix(String s) {
        int length = s.length();
        char ch[] = s.toCharArray();
        int lps[] = new int[length];
        lps[0] = 0;
        int i = 1, len = 0;

        while(i < length) {
            if(ch[i] == ch[len]){
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, lps[length-1]);
    }
}
