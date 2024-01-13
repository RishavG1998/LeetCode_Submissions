class Solution {
    final static int a = 97;
    final static int size = 26;
    public int minSteps(String s, String t) {
        int n = t.length();

        // int[] arr = new int[26];
        int[] arr = new int[size];
        int ans = 0;

        // 9ms
        // for (int i=0; i<n; i++) {
        //     arr[s.charAt(i) - 'a']++;
        //     arr[t.charAt(i) - 'a']--;
        // }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        // 6ms
        for (int i=0; i<n; i++) {
            arr[sc[i] - a]++;
            arr[tc[i] - a]--;
        }

        // 7ms
        // for (int i=0; i<n; i++) {
        //     int sci = sc[i] - a;
        //     int tci = tc[i] - a;
        //     arr[sci] += 1;
        //     arr[tci] -= 1;
        // }

        for (int ele: arr) if (ele > 0) ans += ele;
        return ans;


		// 1M: Worst TC good SC only to revise HashMap
		// HashMap<Character, Integer> map = new HashMap<>();
		
		// for (int i=0; i<n; i++) {
		//     int count = 0;
		//     if (map.containsKey(t.charAt(i))) {
		//         count = map.get(t.charAt(i));
		//     }
		//     map.put(t.charAt(i), ++count);
		// }
		
		// int count2 = 0;
		// for (int i=0; i<n; i++) {
		//     if (map.containsKey(s.charAt(i))) {
		//         count2 = map.get(s.charAt(i));
		//         if (count2 > 0) {
		//             map.put(s.charAt(i), --count2);
		//         }
		//     }
		// }

        // for (HashMap.Entry<Character, Integer> entry: map.entrySet()) {
		//     System.out.println(entry.getKey() + " " + entry.getValue());
		// }
		
		// int ans = 0;
		
		// for (Integer val: map.values()) {
		//     ans += val;
		// }
		// return ans;
    }
}