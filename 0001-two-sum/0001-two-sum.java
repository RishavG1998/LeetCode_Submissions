class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numsSize = nums.length;
        
        // Brute Force
        // for (int i=0; i<numsSize-1; i++) {
        //     for (int j=i+1; j<numsSize; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{};

        // Two-pass Hash Table
        
        // Create hash table
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i=0; i<numsSize; i++) {
            // storing position corresponding to the element
            numsMap.put(nums[i], i);
        }
        
        // Find the complement
        for (int i=0; i<numsSize; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
                return new int[]{numsMap.get(complement), i};
            }
        }
        return new int[]{};
    }
}