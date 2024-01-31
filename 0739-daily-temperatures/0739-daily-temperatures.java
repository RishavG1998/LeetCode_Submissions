class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // 3M: Deque
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; --i) {
            int currTemperature = temperatures[i];

            while (!stack.isEmpty() && currTemperature >= temperatures[stack.peekLast()]) {
                stack.pollLast();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peekLast() - i;
            }

            stack.offerLast(i);
        }

        return result;
        // Deque<Integer> d = new ArrayDeque<>();
        // int n = temperatures.length;
        // int[] outputArr = new int[n];

        // for (int i=n-1; i>=0; i--) {
        //     if (d.isEmpty()) {
        //         d.offerFirst(i);
        //         outputArr[i] = 0;
        //     } else {
        //         while(!d.isEmpty() && temperatures[i] >= temperatures[d.peekFirst()]) {
        //             d.pollFirst();
        //         }

        //         if (d.isEmpty()) {
        //             outputArr[i] = 0;
        //         } else {
        //             outputArr[i] = d.peekFirst() - i;
        //         }

        //         d.offerFirst(i);
        //     }
        // }
        // return outputArr;


        // 2M: Stack
        // Stack<Integer> s = new Stack<>();   
        // int n = temperatures.length;
        // int[] outputArr = new int[n];

        // for (int i=0; i<n; i++) {
        //     while(!s.empty() && (temperatures[s.peek()] < temperatures[i])) {
        //         outputArr[s.peek()] = i - s.pop();
        //     }
        //     s.push(i);
        // }
        // return outputArr;


        // 1M: TLE
        // int start = 0, n = temperatures.length;
        // int[] outputArr = new int[n];
        // while(start < n) {
        //     int currentTemp = temperatures[start];
        //     int i = start + 1;
        //     int count = 1;
        //     while (i < n) {
        //         if (temperatures[i] > currentTemp) {
        //             outputArr[start] = count;
        //             break;
        //         }
        //         count += 1;
        //         i += 1;
        //     }
        //     if (count == n) {
        //         outputArr[start] = 0;
        //     }
        //     start += 1;
        // }
        // return outputArr;
    }
}