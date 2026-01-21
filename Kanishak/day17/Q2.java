// Repeated String Match
package day17;


// Input: a = "abcd", b = "cdabcdab"
// Output: 3
// Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.

class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if (sb.indexOf(b) != -1) return count;

        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) return count;

        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) return count;

        return -1;
    }
}