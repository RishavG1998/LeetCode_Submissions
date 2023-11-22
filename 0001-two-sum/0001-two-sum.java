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
        // First pass: Populate the HashMap
        // Map<Integer, Integer> numsMap = new HashMap<>();
        // for (int i=0; i<numsSize; i++) {
        //     numsMap.put(nums[i], i);
        // }

        // Second pass: Check for the complement
        // for (int i=0; i<numsSize; i++) {
        //     int complement = target - nums[i];
        //     if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
        //         return new int[]{i, numsMap.get(complement)};
        //     }
        // }
        // return new int[]{};

// One-pass Hash Table
        // Map<Integer, Integer> numsMap = new HashMap(){};
        // for (int i=0; i<numsSize; i++) {
        //     int complement = target - nums[i];
        //     if (numsMap.containsKey(complement)) {
        //         return new int[]{numsMap.get(complement), i};
        //     }
        //     numsMap.put(nums[i], i);
        // }
        // return new int[]{}; // No solution found

// Two-pointer Approach
        int numsWithIndex[][] = new int[nums.length][2];
        // Creating 2-d array similar to hashmap
        for (int i=0; i<numsSize; i++) {
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i;
        }
        // Sorting numsWithIndex based on their value present in 0th index
        Arrays.sort(numsWithIndex, Comparator.comparingInt(arr -> arr[0]));
        // Two-pointer method
        int left = 0;
        int right = numsSize - 1;
        while(left < right) {
            int total = numsWithIndex[left][0] + numsWithIndex[right][0];
            if (total < target) {
                left += 1;
            } else if (total > target) {
                right -= 1;
            } else {
                // returning the indices of the elements present in nums
                return new int[]{numsWithIndex[left][1], numsWithIndex[right][1]};
            }
        }
        return new int[]{};
    }
}