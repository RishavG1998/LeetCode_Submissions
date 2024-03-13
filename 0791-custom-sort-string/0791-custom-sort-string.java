class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String res = "";

        for (int i=0; i<order.length(); i++) {
            char ch = order.charAt(i);
            if (!map.containsKey(ch)) continue;
            int freq = map.get(ch);
            for (int j=0; j<freq; j++) res += Character.toString(ch);
            map.remove(ch);
        }

        for (Character key: map.keySet()) {
            int freq = map.get(key);
            for (int i=0; i<freq; i++) res += Character.toString(key);
        }
        
        return res;

        
        // char[] c = s.toCharArray();
        // StringBuilder ans = new StringBuilder();
        // for(int i=0;i<order.length();i++){
        //     for(int j=0;j<c.length;j++){
        //         if(order.charAt(i) == c[j]){
        //         ans.append(c[j]);
        //         c[j] = ' ';
        //         }
        //     }
        // }

        // for(int i =0;i<c.length;i++){
        //     if(c[i] !=  ' '){
        //         ans.append(c[i]);
        //     }
        // }
        // return ans.toString();
    }
}