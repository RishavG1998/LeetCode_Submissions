class Solution {
    // public int numDecodings(String s) {
    //     int[] memo = new int[s.length()];
    //     Arrays.fill(memo, -1);
    //     return topDownDecode(s, 0, memo);
    // }
    // private int topDownDecode(String s, int index, int[] memo) {
    //     // Base case: if the index reaches the end of the string
    //     if (index == s.length()) {
    //         return 1; // This is a valid decoding
    //     }

    //     // Check memoization table
    //     if (memo[index] != -1) {
    //         return memo[index];
    //     }

    //     // Check for leading zero
    //     if (s.charAt(index) == '0') {
    //         return 0; // This decoding is invalid
    //     }

    //     // Decode single digit
    //     int ways = topDownDecode(s, index + 1, memo);

    //     // Decode two digits if possible
    //     if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
    //         ways += topDownDecode(s, index + 2, memo);
    //     }

    //     // Memoize the result
    //     memo[index] = ways;

    //     return ways;
    // }


    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n+1];
        dp[n] = 1;

        for (int i=n-1; i>=0; i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0;
            } else {
                dp[i] += dp[i+1];

                if (i + 1 < n && Integer.parseInt(s.substring(i, i+2)) <= 26) {
                    dp[i] += dp[i+2];
                }
            }
        }
        return dp[0];
    }
}