class Solution {
    public int tribonacci(int n) {

    // 1M: simple recursion
        // if (n <= 1) {
	    //     return n;
	    // }
	    // if (n == 2) {
	    //     return 1;
	    // }
	    
	    // return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3); 

    // 2M: iteration
        // if (n <= 1) {
        //     return n;
        // }
        // if (n == 2) {
        //     return 1;
        // }
        // int tLast = 0, sLast = 1, last = 1;
	    // for(int i=0; i<n-2; i++) {
	    //     int temp = tLast;
	    //    // int temp2 = sLast;
	    //     tLast = sLast;
	    //     sLast = last;
	    //     last = temp + tLast + sLast;
	    // }
	    // return last;

    // 3M
        // int[] dp = {0, 1, 1};
        // for (int num=3; num<=n; num++) {
        //     dp[num%3] = dp[0] + dp[1] + dp[2];
        // }
        // return dp[num%3];

    // 4M: DP
        int[] dp = new int[n+1];
	    Arrays.fill(dp, -1);
	    return solve(n, dp);
    }

    public int solve(int n, int[] dp) {
        if (n <= 1) {
	        return n;
	    }
	    if (n == 2) {
	        return 1;
	    }
	    if (dp[n] != -1) {
	        return dp[n];
	    }
	    
	    return dp[n] = solve(n-1, dp) + solve(n-2, dp) + solve(n-3, dp);
    }
}