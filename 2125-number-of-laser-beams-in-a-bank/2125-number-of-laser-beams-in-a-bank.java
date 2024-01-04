class Solution {
    public int numberOfBeams(String[] bank) {
        // int ans = 0, prev = 0, cnt = 0;
        // for (String s: bank) {
        //     cnt = 0;
        //     for (int i=0; i<s.length(); i++) {
        //         if (s.charAt(i) == '1') cnt++;
        //     }
        //     if (cnt > 0) {
        //         ans += cnt * prev;
        //         prev = cnt;
        //     }
        // }
        // return ans;

        // 2M:
        // int ans = 0, temp = 0;
        // for (String str : bank) {
        //     int n = str.replaceAll("[^1]", "").length();
        //     if (n == 0) continue;
        //     ans += temp * n;
        //     temp = n;
        // }
        // return ans;

        // 3M:
        int prevRowCnt = 0, total = 0;
        for (String row: bank) {
            int curRowCnt = calc(row);

            if (curRowCnt == 0) {
                continue;
            }
            total += prevRowCnt * curRowCnt;
            prevRowCnt = curRowCnt;
        }
        return total;
    }

    private int calc(String s) {
        int cnt = 0;
        for (char c: s.toCharArray()) {
            // if (c - '1' == 0) cnt += 1;
            cnt += c - '0';
        }
        return cnt;
    }
}