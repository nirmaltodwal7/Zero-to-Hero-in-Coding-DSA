// Q1. Edit Distance

package day15;

class Solution {
    public int minDistance(String s, String t) {
        // Always keep t as the shorter string to reduce space
        if (s.length() < t.length()) {
            String temp = s;
            s = t;
            t = temp;
        }

        int n = s.length();
        int m = t.length();

        int[] dp = new int[m + 1];

        // Base case: converting "" to t
        for (int j = 0; j <= m; j++) {
            dp[j] = j;
        }

        for (int i = 1; i <= n; i++) {
            int prev = dp[0];  // dp[i-1][j-1]
            dp[0] = i;         // dp[i][0]

            for (int j = 1; j <= m; j++) {
                int temp = dp[j];  // store dp[i-1][j]

                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[j] = prev;
                } else {
                    dp[j] = 1 + Math.min(
                        prev,              // replace
                        Math.min(
                            dp[j],          // delete
                            dp[j - 1]        // insert
                        )
                    );
                }
                prev = temp;
            }
        }
        return dp[m];
    }
}
