class Solution {
    public int majorityElement(int[] nums) {
        // 3M: Moore Voting Algorithm
        int count = 1, candidate = nums[0], n = nums.length;
        for (int i=1; i<n; i++) {
            if (count == 0) candidate = nums[i];
            if (nums[i] == candidate) count++;
            else count--;
        }
        return candidate;
        
        // 2M: Hash Map O(n)
        // Map<Integer, Integer> mp = new HashMap<>();
        // int n = nums.length;
        // for (int num: nums) {
        //     if (!mp.containsKey(num)) {
        //         mp.put(num, 1);
        //     } else {
        //         mp.put(num, mp.get(num)+1);
        //     }
        // }
        // for (int i=0; i<n; i++) {
        //     mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        // }
        // n = n / 2;
        // for (Map.Entry<Integer, Integer> entry: mp.entrySet()) {
        //     if (entry.getValue() > n) {
        //         return entry.getKey();
        //     }
        // }
        // return 0;
        

        // 1M: Sorting O(nlogn)
        // Arrays.sort(nums);
        // return nums[nums.length/2];

    }
}