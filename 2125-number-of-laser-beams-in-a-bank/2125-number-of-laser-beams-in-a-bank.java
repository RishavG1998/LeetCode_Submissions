class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0, prev = 0, cnt = 0;
        for (String s: bank) {
            cnt = 0;
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '1') cnt++;
            }
            if (cnt > 0) {
                ans += cnt * prev;
                prev = cnt;
            }
        }
        return ans;
    }
}