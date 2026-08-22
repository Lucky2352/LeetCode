class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
           int x = n - mid;
            if (nums[mid] >= x) {
                if (mid == 0 || nums[mid - 1] < x) {
                    return x;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}