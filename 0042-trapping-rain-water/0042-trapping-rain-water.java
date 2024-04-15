class Solution {
    public int trap(int[] height) {
        // TWO POINTERS
        int n = height.length;
        if (n <= 2) return 0;

        int left = 1, right = n-2, ans = 0;
        int maxLeft = height[0], maxRight = height[n-1];
        while (left <= right) {
            if (maxLeft < maxRight) {
                // NO WATER TRAPPED
                if (height[left] > maxLeft)
                    maxLeft = height[left];
                else
                    ans += maxLeft - height[left];
                left += 1;
            } else {
                // NO WATER TRAPPED
                if (height[right] > maxRight)
                    maxRight = height[right];
                else 
                    ans += maxRight - height[right];
                right -= 1;
            }
        }
        return ans;




        // int n = height.length;
        // int[] maxLeft = new int[n];
        // int[] maxRight = new int[n];

        // for (int i=1; i<n; i++) 
        //     maxLeft[i] = Math.max(height[i-1], maxLeft[i-1]);

        // for (int i=n-2; i>=0; i--)
        //     maxRight[i] = Math.max(height[i+1], maxRight[i+1]);

        // int ans = 0;
        // for (int i=0; i<n; i++) {
        //     int waterlevel = Math.min(maxLeft[i], maxRight[i]);
        //     if (waterlevel > height[i]) 
        //         ans += waterlevel - height[i];
        // }
        // return ans;
    }
}