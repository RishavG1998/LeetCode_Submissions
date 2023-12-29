class Solution {

// Step 1 - Identify a recurrence relation between subproblems. In this problem,
// Recurrence Relation:
// mincost(i) = cost[i]+min(mincost(i-1), mincost(i-2))
// Base cases:
// mincost(0) = cost[0]
// mincost(1) = cost[1]


    // 1M: Recursive Top Down - O(2^n) Time Limit Exceeded
    // Convert the recurrence relation to recursion
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    // }

    // private int minCost(int[] cost, int n) {
    //     if (n < 0) return 0;
    //     if (n == 0 || n == 1) return cost[n];

    //     return cost[n] + Math.min(minCost(cost, n-1), minCost(cost, n-2));
    // }



    // 2M: Top Down Memoization - O(n) 
    // Optimization 1 - Top Down DP - Add memoization to recursion - From exponential to linear.
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //     return Math.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp));
    // }

    // private int minCost(int[] cost, int n, int[] dp) {
    //     if (n < 0) return 0;
    //     if (n == 0 || n == 1) return cost[n];

    //     if (dp[n] != -1) return dp[n];
    //     // TLE for cost = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0]
    //     // if (dp[n] != 0) return dp[n];

    //     dp[n] = cost[n] + Math.min(minCost(cost, n-1, dp), minCost(cost, n-2, dp));
    //     return dp[n];
    // }
    


    // 3M: Bottom up tabulation - O(n)
    // Bottom Up DP - Convert recursion to iteration - Getting rid of recursive stack
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for (int i=0; i<n; i++) {
            if (i<2) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }

}