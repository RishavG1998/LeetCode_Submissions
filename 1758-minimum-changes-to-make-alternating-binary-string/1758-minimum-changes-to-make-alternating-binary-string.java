class Solution {
    public int minOperations(String s) {

    // 1M
        // int count1 = 0, count2 = 0;
        // int binary = 0;
        // for (int i=0; i<s.length(); i++) {
        //     if (i%2 == 0) {
        //         binary++;
        //     } else {
        //         binary--;
        //     }
        //     String binaryStr = Integer.toString(binary);
        //     String character = "" + s.charAt(i);
        //     // Stirng char1 = String.valueOf(s.charAt(i))
        //     if (!binaryStr.equals(character)) {
        //         count1++;
        //     }
        //     if (binaryStr.equals(character)) {
        //         count2++;
        //     }
        // }
        // return Math.min(count1, count2);

        
    // 2M
        // int countStartingWith0 = 0;
        // int countStartingWith1 = 0;
        // for (int i=0; i<s.length(); i++) {
        //     if (i%2 == 0) {
        //         if (s.charAt(i) == '0') {
        //             countStartingWith0++;
        //         } else {
        //             countStartingWith1++;
        //         }
        //     } else {
        //         if (s.charAt(i) == '1') {
        //             countStartingWith0++;
        //         } else {
        //             countStartingWith1++;
        //         }
        //     }
        // }
        // return Math.min(countStartingWith0, countStartingWith1);

    // 3M
        int n = s.length();
        int countStartingWith0 = 0;

        for(int i=0; i<n; i++) {
            if (s.charAt(i) - '0' == i % 2) {
                countStartingWith0++;
            }
        }

        return Math.min(countStartingWith0, n - countStartingWith0);
    }
}