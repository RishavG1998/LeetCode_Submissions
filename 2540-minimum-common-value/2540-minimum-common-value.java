class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else {
                if (nums1[i] < nums2[j]) {
                    if (i < nums1.length-1) i++;
                    else break;
                }

                if (nums1[i] > nums2[j]) {
                    if (j < nums2.length-1) j++;
                    else break;
                }
            }
        }
        return -1;
    }
}