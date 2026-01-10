// 3193. Count the Number of Inversions //

class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfPermutations(int n, int[][] requirements) {

        // Map prefix length -> required inversion count
        int[] req = new int[n + 1];
        boolean[] hasReq = new boolean[n + 1];

        for (int[] r : requirements) {
            int len = r[0] + 1; // prefix length
            hasReq[len] = true;
            req[len] = r[1];
        }

        int maxInv = n * (n - 1) / 2;
        int[] dp = new int[maxInv + 1];
        dp[0] = 1;

        for (int len = 1; len <= n; len++) {
            int[] next = new int[maxInv + 1];
            long windowSum = 0;

            for (int inv = 0; inv <= maxInv; inv++) {
                windowSum += dp[inv];
                if (inv >= len) windowSum -= dp[inv - len];
                next[inv] = (int)((windowSum % MOD + MOD) % MOD);
            }

            // 🔑 APPLY REQUIREMENT AT THIS PREFIX LENGTH
            if (hasReq[len]) {
                int need = req[len];
                for (int inv = 0; inv <= maxInv; inv++) {
                    if (inv != need) next[inv] = 0;
                }
            }

            dp = next;
        }

        int ans = 0;
        for (int v : dp) ans = (ans + v) % MOD;
        return ans;
    }
}
