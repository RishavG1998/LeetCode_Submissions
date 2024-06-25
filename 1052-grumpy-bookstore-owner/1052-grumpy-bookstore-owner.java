class Solution {
    // 2M: SLIDING WINDOW
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int unrealizedCustomers = 0;

        for (int i=0; i<minutes; ++i) 
            unrealizedCustomers += customers[i] * grumpy[i];

        int maxUnrealizedCustomers = unrealizedCustomers;
        for (int i=minutes; i<n; ++i) {
            unrealizedCustomers -= customers[i-minutes] * grumpy[i-minutes];
            unrealizedCustomers += customers[i] * grumpy[i];

            maxUnrealizedCustomers = Math.max(maxUnrealizedCustomers, unrealizedCustomers);
        }

        int maxSatisfied = maxUnrealizedCustomers;
        for(int i=0; i<n; ++i) {
            maxSatisfied += customers[i] * (1-grumpy[i]);
        }
        return maxSatisfied;
    }




    // 1M: BRUTE FORCE
    // public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    //     int n = customers.length;
    //     int maxSatisfaction = 0;

    //     for (int i=0; i<n; ++i) {
    //         if (grumpy[i] == 0) maxSatisfaction += customers[i];
    //     }

    //     // given: minutes is less than or equal to n
    //     int maxAdditionalSatisfaction = 0;
    //     for (int i=0; i<=n-minutes; ++i) {
    //         int currentAdditionalSatisfaction = 0;
    //         for (int j=i; j<i+minutes; ++j) {
    //             if (grumpy[j] == 1)
    //                 currentAdditionalSatisfaction += customers[j];
    //         }
    //         maxAdditionalSatisfaction = Math.max(maxAdditionalSatisfaction, currentAdditionalSatisfaction);
    //     }

    //     maxSatisfaction += maxAdditionalSatisfaction;
    //     return maxSatisfaction;
    // }
}