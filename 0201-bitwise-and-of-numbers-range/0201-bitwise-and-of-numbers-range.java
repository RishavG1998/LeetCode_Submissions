class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // 3M: Bit Operation solution
        if (left == 0) return 0;
        int moveFactor = 1;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            moveFactor <<= 1;
        }
        System.out.println(left);
        System.out.println(moveFactor);
        return left * moveFactor;


        // 2M:
        // Since bitwise and will always produce result smaller than
        // or equal to the number
        // while(right > left) {
        //     right = right & (right-1);
        // }
        // return right;

        // TLE
        // int ans = left;
        // for (int i=left+1; i<=right; i++) {
        //     ans = ans & i;
        //     System.out.println(i);
        //     if (ans == 0) return 0;
        // }
        // return ans;

    }
}