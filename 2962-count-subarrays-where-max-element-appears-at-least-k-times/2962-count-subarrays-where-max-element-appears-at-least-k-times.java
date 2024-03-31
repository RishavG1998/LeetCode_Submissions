// 2M: Sliding Window Without Map
class Solution {
    public long countSubarrays(int[] nums, int k) {
        long maxNum = Long.MIN_VALUE, count = 0, n = nums.length;
        long left = 0, right = 0, ans = 0;
        
        // This is slower than for-each loop
        // long count = 0;
        // long maxNum = Arrays.stream(nums).max().getAsInt();
        
        // Find the maximum element in the array
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        
        while (right < n) {
            if (nums[(int) right] == maxNum) {
                count++;
            }
            // If count is greater than or equal to k, calculate subarrays count
            while (count >= k) {
                ans += nums.length - right;
                if (nums[(int) left] == maxNum) count--;
                left++;
            }
            right++;
        }
        return ans;
    }
}


// 1M: Brute Force(TLE)
// class Solution {
//     public long countSubarrays(int[] nums, int k) {
//         // Handle NullPointerException
//         if (nums == null || nums.length == 0) return 0;
//         int count = 0, n = nums.length;
//         // Find the maximum element in the array
//         int max = findMax(nums);
//         // This is slower than for-each loop
//         // int max = Arrays.stream(nums).max().getAsInt();

//         // Iterate through all possible subarrays
//         for (int start=0; start<n; start++) {
//             for (int end=start; end<n; end++) {
//                 int[] subArray = Arrays.copyOfRange(nums, start, end+1);
//                 int subArrayMax = findMax(subArray);
                
//                 // If the maximum element of the subarray is the maximum element of the array
//                 if (subArrayMax == max) {
//                     // Check if the maximum element appears at least k times
//                     if (countMaxOccurences(subArray, subArrayMax) >= k) count++;
//                     // This is slower than for-each loop
//                     // if (Arrays.stream(subArray).filter(ele -> ele == subArrayMax).count() >= (long)k) count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private static int findMax(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         for (int num: arr) {
//             max = Math.max(num, max);
//         }
//         return max;
//     }

//     private static int countMaxOccurences(int[] arr, int max) {
//         int count = 0;
//         for (int num: arr) {
//             if (num == max) count++;
//         }
//         return count;
//     }
// }
