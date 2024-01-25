class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        return lcs(text1.toCharArray(), text2.toCharArray(), text1.length(), text2.length(), dp);
    }

    private int lcs(char[] c1, char[] c2, int m, int n, int[][] dp) {
        if (m == 0 || n == 0) return 0;

        if (c1[m-1] == c2[n-1]) {
            return dp[m][n] = 1 + lcs(c1, c2, m-1, n-1, dp);
        } 

        if (dp[m][n] != -1) return dp[m][n];
        return dp[m][n] = Math.max(lcs(c1, c2, m-1, n, dp), lcs(c1, c2, m, n-1, dp));
    }
}