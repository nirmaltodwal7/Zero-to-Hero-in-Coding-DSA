// Count the Number of Inversions

package day12;

import java.util.*;

public class Q1 {
    static int mod = (int)1e9 +7;
    public int numberOfPermutations(int n, int[][] requirements) {
        
        int[] count = new int[n];
        Arrays.fill(count, -1);
        int m = 0;
        
        for (int[] r : requirements) {
            count[r[0]] = r[1];
            m = Math.max(m, r[1]);
        }

        if (count[0] > 0)
            return 0;

        int[] dp = new int[m + 1];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int max = count[i] < 0 ? m : count[i];
            int r = count[i - 1];
            if (r >= 0) {
                Arrays.fill(dp, 0, r, 0);
                Arrays.fill(dp, r + 1, Math.min(i + r, max) + 1, dp[r]);
                Arrays.fill(dp, Math.min(i + r, max) + 1, m + 1, 0);
            } else {
                for (int j = 1; j <= max; j++) 
                    dp[j] = (dp[j] + dp[j - 1]) % mod;
                
                for (int j = max; j > i; j--) 
                    dp[j] = (dp[j] - dp[j - i - 1] + mod) % mod;
            }
        }

        return dp[m];
    }
}
