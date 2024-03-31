// 2M: Sliding Window With Map
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, n = nums.length, ans = 0;
        while (right < n) {
            int num = nums[right];
            map.put(num, map.getOrDefault(num, 0) + 1);
            while (map.get(num) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}

// 1M: Brute Force Approach
// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {
//         int ans = 0, n = nums.length;
//         for (int start=0; start<n; start++) {
//             for (int end=start; end<n; end++) {
//                 var subArray = Arrays.copyOfRange(nums, start, end+1);
//                 var isValidSubArray = checkSubArrayValidity(subArray, k);

//                 if (isValidSubArray) ans = Math.max(ans, subArray.length);
//             }
//         }
//         return ans;
//     }

//     public static boolean checkSubArrayValidity(int[] arr, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int num: arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//             if (map.get(num) <= k) {
//                 continue;
//             }
//             return false;
//         }
//         return true;
//     }
// }