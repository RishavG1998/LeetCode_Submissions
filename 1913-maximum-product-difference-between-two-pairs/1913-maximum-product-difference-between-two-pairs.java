class Solution {
    public int maxProductDifference(int[] nums) {
        // Arrays.sort(nums);
        // return (nums[nums.length - 1] * nums[nums.length-2]) - (nums[0]*nums[1]); 
        // Initialize variables to hold the largest, second-largest, smallest, and second-smallest numbers
        int biggest = 0;
        int secondBiggest = 0;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        // Iterate through the input array 'nums'
        for (int num : nums) {
            // Check if 'num' is greater than the current 'biggest'
            if (num > biggest) {
                // Update 'secondBiggest' and 'biggest' accordingly
                secondBiggest = biggest;
                biggest = num;
            } else {
                // If 'num' is not the largest, update 'secondBiggest' if necessary
                secondBiggest =  Math.max(secondBiggest, num);
            }
            
            // Check if 'num' is smaller than the current 'smallest'
            if (num < smallest) {
                // Update 'secondSmallest' and 'smallest' accordingly
                secondSmallest = smallest;
                smallest = num;
            } else {
                // If 'num' is not the smallest, update 'secondSmallest' if necessary
                secondSmallest = Math.min(secondSmallest, num);
            }
        }
        // Calculate the product difference of the largest and smallest values and return the result
        return biggest * secondBiggest - smallest * secondSmallest;
    }
}