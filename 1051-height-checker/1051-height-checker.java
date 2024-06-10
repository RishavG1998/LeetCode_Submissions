class Solution {
    // 3M: Best Approach Without Sorting
    public int heightChecker(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height: heights) {
            max = Math.max(max, height);
        }
        int[] heightToFreq = new int[max+1];
        for (int height: heights) {
            ++heightToFreq[height];
        }
        int j=0, count=0;
        for (int i=1; i<=max; ++i) {
            while (heightToFreq[i]-- != 0) {
                if (i != heights[j]) {
                    ++count; 
                }
                ++j;
            }
        }
        return count;
    }




    // 2M: Count Sort TC - O(n)
    // public int heightChecker(int[] heights) {
    //     int[] expected = heights.clone();
    //     countingSort(expected);
    //     int count = 0;

    //     for (int i=0; i<heights.length; ++i) {
    //         if (expected[i] != heights[i]) ++count;
    //     }
    //     return count;
    // }

    // public void countingSort(int[] arr) {
    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;
    //     for (int num: arr) {
    //         max = Math.max(max, num);
    //         min = Math.min(min, num);
    //     }
    //     int[] count = new int[max+1];
    //     for (int num: arr) {
    //         ++count[num];
    //     }
    //     int j=0;
    //     for (int i=0; i<count.length; ++i) {
    //         while (count[i]-- != 0) {
    //             arr[j] = i;
    //             ++j;
    //         }
    //     }
    // }



    // 1M: Default Java Sorting TC - O(nlogn)
    // public int heightChecker(int[] heights) {
    //     // clone()
    //     // int[] expected = heights.clone();

    //     // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    //     // int[] expected = new int[heights.length];
    //     // System.arraycopy(heights, 0, expected, 0, heights.length);

    //     // copyOf()
    //     // int[] expected = Arrays.copyOf(heights, heights.length);

    //     // copyOfRange()
    //     int[] expected = Arrays.copyOfRange(heights, 0, heights.length);

    //     Arrays.sort(expected);
    //     int count = 0;
    //     for (int i=0; i<heights.length; ++i) {
    //         if (heights[i] != expected[i]) ++count;
    //     }
    //     return count;
    // }
}