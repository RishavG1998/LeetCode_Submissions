class Solution {
    // 1M
    // int MOD = 1000000007;
    // int[][] dp;
    // public int numRollsToTarget(int n, int k, int target) {
    //     if (n == 0 && target == 0) return 1;
    //     if (target < n || n*k < target) return 0;

    //     dp = new int[n+1][target+1];
    //     return recursion(n, k, target);
    // }

    // public int recursion(int n, int k, int target) {
    //     if (n == 0 && target == 0) return 1;
    //     if (target < n || n*k < target) return 0;

    //     if (dp[n][target] != 0) return dp[n][target];

    //     int res = 0;
    //     for (int i=1; i<=k; i++) {
    //         if (target < i) break;
    //         res = (res + recursion(n-1, k, target-i) % MOD) % MOD;
    //     }

    //     dp[n][target] = res;
    //     return res;
    // }

    // 2M
    final int MOD = (int) Math.pow(10, 9) + 7;

    public int numRollsToTarget(int n, int k, int target) {
        if (n == 0 && target == 0) return 1;
        if (target < n || n*k < target) return 0;

        int[][] dp = new int [n+1][target+1];
        for (int[] d: dp) {
            Arrays.fill(d, -1);
        }

        return recursion(n, k, target, dp);
    }

    public int recursion(int n, int k, int target, int[][] dp) {
        if (n == 0 && target == 0) return 1;
        if (target < n || n*k < target) return 0;

        if (dp[n][target] != -1) return dp[n][target];

        int res = 0;
        for (int i=1; i<=k; i++) {
            if (target < i) break;
            res = (res + recursion(n-1, k, target-i, dp) % MOD) % MOD;
        }

        dp[n][target] = res;
        return res;
    }
}