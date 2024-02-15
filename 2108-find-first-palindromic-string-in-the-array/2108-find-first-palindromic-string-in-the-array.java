class Solution {

    // 2M: 100%
    public boolean checkWordForPalindrome(String word) {
        int i = 0, j = word.length()-1;
        while(i<=j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        // 2M
        for (String word: words) {
            if (checkWordForPalindrome(word)) {
                return word;
            }
        }
        return "";



        // 1M
        // int n = words.length;
        // for (String word: words) {
        //     char[] chArr = word.toCharArray();
        //     int i=0, count = 0, len = chArr.length;
        //     while(i<len/2) {
        //         if (chArr[i] == chArr[len-i-1]) {
        //             count += 1;
        //         }
        //         i += 1;
        //     }
        //     if (count == len/2) {
        //         return word;
        //     }
        // }
        // return "";


    }
}