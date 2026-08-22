class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int odd = 0;
        int total = 0;
        while (j < n) {
            if (nums[j] % 2 != 0)
                odd++;
            if (odd == k) {
                int left = 0;
                while (nums[i] % 2 == 0) {
                    left++;
                    i++;
                }
                int temp = j + 1;
                int right = 0;
                while (temp < n && nums[temp] % 2 == 0) {
                    right++;
                    temp++;
                }
                total += (left + 1) * (right + 1);
                i++;
                odd--;
            }
            j++;
        }
        return total;
    }
}