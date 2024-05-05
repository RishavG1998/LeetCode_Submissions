class Solution {
    public int findMaxK(int[] nums) {
        // 2M: SORTING AND TWO POINTERS
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            if (-nums[left] == nums[right]) {
                return nums[right];
            }
            if (-nums[left] < nums[right])
                --right;
            else 
                ++left;
        }
        return -1;


        // 1M: BRUTE FORCE O(n2)
        // int max = -1;
        // for (int i=0; i<nums.length; i++) {
        //     int current = Integer.MIN_VALUE;
        //     if (nums[i] < 0) {
        //         current = Math.abs(nums[i]);
        //     }
        //     for (int j=0; j<nums.length; j++) {
        //         if (current == nums[j]) {
        //             max = Math.max(max, current);
        //         }
        //     }
        // }
        // return max;
    }
}