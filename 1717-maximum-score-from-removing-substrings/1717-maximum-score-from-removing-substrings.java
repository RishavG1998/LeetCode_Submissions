class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack();
        int totalScore = 0;
        String highPriorityPair = x > y ? "ab" : "ba";
        String lowPriorityPair = highPriorityPair.equals("ab") ? "ba" : "ab";

        // FIRST PASS
        String stringAfterFirstPass = removePairs(highPriorityPair, s);
        int removedPairsCount = (s.length() - stringAfterFirstPass.length()) / 2;
        totalScore = removedPairsCount * Math.max(x, y);

        // SECOND PASS
        String stringAfterSecondPass = removePairs(lowPriorityPair, stringAfterFirstPass);
        removedPairsCount = (stringAfterFirstPass.length() - stringAfterSecondPass.length()) / 2;
        totalScore += removedPairsCount * Math.min(x, y);

        return totalScore;
    }

    public String removePairs(String pair, String input) {
        Stack<Character> charStack = new Stack();

        for (int i=0; i<input.length(); ++i) {
            char currentChar = input.charAt(i);
            if (currentChar == pair.charAt(1) && !charStack.isEmpty() 
                && charStack.peek() == pair.charAt(0)) {
                charStack.pop();
            } else {
                charStack.push(currentChar);
            }
        }

        StringBuilder remainingChars = new StringBuilder();
        while (!charStack.isEmpty()) {
            remainingChars.append(charStack.pop());
        }
        return remainingChars.reverse().toString();
    }
}