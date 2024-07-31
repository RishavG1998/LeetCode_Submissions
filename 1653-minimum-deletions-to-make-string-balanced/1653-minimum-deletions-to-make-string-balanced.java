class Solution {
    // Considering every single character as the middle point
    // we check the number of b's on the left and number of 
    // a's on the right side of it and then we find the minimum
    // of every single one of them
    public int minimumDeletions(String s) {
        // 5M: Optimized DP
        int n = s.length();
        int bCount = 0, delCount = 0;
        for (char ch: s.toCharArray()) {
            if (ch == 'b') {
                bCount++;
            } else {
                delCount = Math.min(delCount+1, bCount);
            }
        }
        return delCount;



        // 4M: DP
        // int n = s.length(), bCount = 0;
        // int[] dp = new int[n+1];
        
        // for (int i=0; i<n; ++i) {
        //     if (s.charAt(i) == 'b') {
        //         dp[i+1] = dp[i];
        //         bCount++;
        //     } else {
        //         dp[i+1] = Math.min(dp[i] + 1, bCount);
        //     }
        // }
        // return dp[n];


        
        // 3M: Stack
        // Stack<Character> st = new Stack();
        // int delCount = 0;
        // for (char ch: s.toCharArray()) {
        //     if (!st.isEmpty() && st.peek() == 'b' && ch == 'a') {
        //         delCount++;
        //         st.pop();
        //     } else {
        //         st.push(ch);
        //     }
        // }
        // return delCount;



        // 2M: Space Optimization
        // int n = s.length();
        // int aCount = 0;

        // for (int i=0; i<n; ++i) {
        //     if (s.charAt(i) == 'a') aCount++;
        // }

        // int bCount = 0, ans = n;
        // for (int i=0; i<n; ++i) {
        //     if (s.charAt(i) == 'a') aCount--;

        //     ans = Math.min(ans, aCount + bCount);
        //     if (s.charAt(i) == 'b') bCount++;
        // }
        // return ans;



        // 1M:
        // int n = s.length();
        // int[] countA = new int[n];
        // int aCount = 0;

        // // Calculate the number of a's on the right
        // for (int i=n-1; i>=0; --i) {
        //     countA[i] = aCount;
        //     if (s.charAt(i) == 'a') aCount++; 
        // }

        // int ans = n, bCount = 0;;
        // for (int i=0; i<n; ++i) {
        //     ans = Math.min(ans, bCount+countA[i]);
        //     if (s.charAt(i) == 'b') bCount++;
        // }
        // return ans;
    }
}