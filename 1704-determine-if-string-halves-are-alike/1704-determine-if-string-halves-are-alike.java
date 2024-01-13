class Solution {

    // 1M: O(n)
    // public boolean halvesAreAlike(String s) {
	// 	// String a = "", b = "";
	// 	s = s.toLowerCase();
	// 	String[] v = {"a","e","i","o","u"};
	// 	int count1 = 0, count2 = 0;
		
	// 	for (int i=0; i<s.length(); i++) {
	// 	    if (i<s.length()/2 && containsCharacter(v, s.charAt(i))) {
	// 	        // a += s.charAt(i);
	// 	        count1 += 1;
	// 	    } else if (containsCharacter(v, s.charAt(i))) {
	// 	        // b += s.charAt(i);
	// 	        count2 += 1;
	// 	    }
	// 	}
    //     return count1 == count2;
    // }

    // public static boolean containsCharacter(String[] arr, char ch) {
	//     String str = String.valueOf(ch);
	//     for (String ele: arr) {
	//         if (ele.equals(str)) {
	//             return true;
	//         }
	//     }
	//     return false;
	// }

    // 2M:
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        // converting string to lowercase makes the code slow by 2 times
        // s = s.toLowerCase();

        int length = s.length();
        int midPoint = length / 2;
        // String firstHalf = "";
        // String secondHalf = "";

        // Using substring() function is nearly 4 times faster than for loop
        // for (int i=0; i<s.length(); i++) {
		//     if (i<s.length()/2) {
		//         firstHalf += s.charAt(i);
		//     } else {
		//         secondHalf += s.charAt(i);
		//     }
		// }

        String firstHalf = s.substring(0, midPoint);
        String secondHalf = s.substring(midPoint);

        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
    }

    private int countVowels(String str, Set<Character> vowels) {
        int count = 0;
        // Both for loops has same execution time
        
        // for (char c : str.toCharArray()) {
        //     if (vowels.contains(c)) {
        //         count++;
        //     }
        // }
        for (int i=0; i<str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }
}