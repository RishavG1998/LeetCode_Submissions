class Solution {
    public int minOperations(int[] nums) {
        // 1M:
        // Map<Integer, Integer> numMap = new HashMap<>();
	    // int cnt = 0;
        // for (int num: nums) {
        //     // cnt = 0;
        //     // if (numMap.containsKey(num)) {
        //     //     cnt = numMap.get(num);
        //     // }
        //     // numMap.put(num, ++cnt);
        //     numMap.put(num, numMap.getOrDefault(num, 0)+1);
        // }
        // PRINT MAP VALUES
        // for (Map.Entry<Integer, Integer> entry: numMap.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        // int ans = 0;
        // for (Map.Entry<Integer, Integer> entry: numMap.entrySet()) {
        //     int value = entry.getValue();
        //     if (value == 1) return -1;
            
        //     ans += value/3;
            
        //     if(value%3 != 0) ans += 1;
        // }
        // return ans;


        // 2M:
        Arrays.sort(nums);
        int res = 0;
        int i = 0;

        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == nums[i]) {
                j+=1;
            }

            int cnt = j-i;
            if (cnt == 1) return -1;
            res += cnt/3;
            if (cnt%3 != 0) res += 1;
            i = j;
        }
        return res;
    }
}