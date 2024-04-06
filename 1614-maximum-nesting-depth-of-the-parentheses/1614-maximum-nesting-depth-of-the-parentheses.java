class Solution {
    public int maxDepth(String s) {
        int curr = 0, ans = 0;

        for (char ch: s.toCharArray()) {
            if (ch == '(') curr++;
            else if (ch == ')') curr--;
            ans = Math.max(ans, curr);
        }
        
        return ans;


        // Stack<Character> st = new Stack<>();
        // if (s == "") return 0;
        // int ans = -1;
        // for (int i=0; i<s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if (ch == '(') {
        //         st.push(ch);
        //     } else if (ch == ')') {
        //         st.pop();
        //     }
        //     ans = Math.max(ans, st.size());
        // }
        // if (st.size() != 0) return -1;
        // else return ans;
    }
}