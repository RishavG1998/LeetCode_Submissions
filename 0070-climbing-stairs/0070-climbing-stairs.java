class Solution {
    public int climbStairs(int n) {
    // 1M: simple recursion
        // if (n <= 2) {
        //     return n;
        // }
        // return climbStairs(n-1) + climbStairs(n-2);
        
    // 2M: iteration
        // if (n <= 2) {
        //     return n;
        // }
        // int secondLast = 1, last = 2;
        // for(int i=0; i<n-2; i++) {
        //     int temp = secondLast;
        //     secondLast = last;
        //     last = temp + last;
        // }
        // return last;

    // 3M: dynamic programming
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    // 3M: dp
    public int solve(int n, int[] dp) {
        if (n <= 2) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        return dp[n] = solve(n-1, dp) + solve(n-2, dp);
    }
}