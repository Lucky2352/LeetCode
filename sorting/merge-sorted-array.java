class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int left = 0;
        int right = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                left++;
            } else {
                for (int i = m; i > left; i--) {
                    nums1[i] = nums1[i - 1];
                }

                nums1[left] = nums2[right];

                left++;
                right++;
                m++;
            }
        }
        while (right < n) {
            nums1[m] = nums2[right];
            m++;
            right++;
        }
    }
}
