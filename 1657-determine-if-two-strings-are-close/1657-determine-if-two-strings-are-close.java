class Solution {
    final static int n = 26;
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[n];
        int[] freq2 = new int[n];

        for (char ch: word1.toCharArray()) {
            freq1[ch - 'a']++;
        }

        for (char ch: word2.toCharArray()) {
            freq2[ch - 'a']++;
        }

        // for (int i=0; i<n; i++) {
        //     if ((freq1[i] == 0 && freq2[i] != 0) || 
        //     (freq1[i] != 0 && freq2[i] == 0)) {
        //         return false;
        //     }
        // }

        for (int i=0; i<n; i++) {
            if (freq1[i] == freq2[i]) 
                continue;
            if (freq1[i] == 0 || freq2[i] == 0)
                return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // for (int i=0; i<freq1.length; i++) {
        //     if (freq1[i] != freq2[i]) {
        //         return false;
        //     }
        // }

        for (int i=0; i<26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;


        // Map<Character, Integer> word1Map = new HashMap<>();
        // Map<Character, Integer> word2Map = new HashMap<>();
        // for (char c : word1.toCharArray()) {
        //     word1Map.put(c, word1Map.getOrDefault(c, 0) + 1);
        // }
        // for (char c : word2.toCharArray()) {
        //     word2Map.put(c, word2Map.getOrDefault(c, 0) + 1);
        // }
        // if (!word1Map.keySet().equals(word2Map.keySet())) {
        //     return false;
        // }
        // List<Integer> word1FrequencyList = new ArrayList<>(word1Map.values());
        // List<Integer> word2FrequencyList = new ArrayList<>(word2Map.values());
        // Collections.sort(word1FrequencyList);
        // Collections.sort(word2FrequencyList);
        // return word1FrequencyList.equals(word2FrequencyList);
    }
}