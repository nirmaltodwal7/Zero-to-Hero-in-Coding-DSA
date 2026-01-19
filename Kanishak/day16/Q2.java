// Longest Subsequence Repeated k Times

package day16;


import java.util.*;
class Solution {

    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        // keep only valid chars
        List<Character> chars = new ArrayList<>();
        for (int i = 25; i >= 0; i--) {
            if (freq[i] >= k) chars.add((char) (i + 'a'));
        }

        String ans = "";
        Queue<String> q = new LinkedList<>();
        q.offer("");

        while (!q.isEmpty()) {
            String cur = q.poll();

            for (char c : chars) {
                String next = cur + c;
                if (isValid(s, next, k)) {
                    q.offer(next);
                    if (next.length() > ans.length() ||
                       (next.length() == ans.length() && next.compareTo(ans) > 0)) {
                        ans = next;
                    }
                }
            }
        }
        return ans;
    }

    private boolean isValid(String s, String x, int k) {
        int idx = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == x.charAt(idx)) {
                idx++;
                if (idx == x.length()) {
                    idx = 0;
                    count++;
                    if (count == k) return true;
                }
            }
        }
        return false;
    }
}
