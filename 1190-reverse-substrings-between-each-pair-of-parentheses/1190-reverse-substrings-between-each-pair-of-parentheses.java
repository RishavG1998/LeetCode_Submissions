class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack();
        
        for (int i=0; i<s.length(); ++i) {
            StringBuilder sb = new StringBuilder();
            if (s.charAt(i) == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
                for (int j=0; j<sb.length(); ++j) {
                    st.push(sb.charAt(j));
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (char ch: st) {
            res.append(ch);
        }
        return res.toString();
    }


    // 2M
    // public String reverseParentheses(String s) {
    //     int n = s.length();
    //     Stack<Integer> openParanthesesIndices = new Stack();
    //     int[] pair = new int[n];

    //     for (int i=0; i<n; ++i) {
    //         if (s.charAt(i) == '(') {
    //             openParanthesesIndices.push(i);
    //         }
    //         if (s.charAt(i) == ')') {
    //             int j = openParanthesesIndices.pop();
    //             pair[i] = j;
    //             pair[j] = i;
    //         }
    //     }

    //     StringBuilder result = new StringBuilder();

    //     for (int i=0, direction = 1; i<n; i+=direction) {
    //         if (s.charAt(i) == '(' || s.charAt(i) == ')') {
    //             i = pair[i];
    //             direction = -direction;
    //         } else {
    //             result.append(s.charAt(i));
    //         }
    //     }
    //     return result.toString();

    // }




    // 1M
    // public String reverseParentheses(String s) {
    //     Stack<Integer> st = new Stack();
    //     StringBuilder sb = new StringBuilder();

    //     for (int i=0; i<s.length(); ++i) {
    //         if (s.charAt(i) == '(') {
    //             st.push(sb.length());
    //         } else if (s.charAt(i) == ')') {
    //             int start = st.pop();
    //             reverse(sb, start, sb.length() - 1);
    //         } else {
    //             sb.append(s.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }

    // private void reverse(StringBuilder sb, int start, int end) {
    //     while (start < end) {
    //         char temp = sb.charAt(start);
    //         sb.setCharAt(start++, sb.charAt(end));
    //         sb.setCharAt(end--, temp);
    //     }
    // }
}