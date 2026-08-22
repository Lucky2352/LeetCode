class Solution {
    public int maxProduct(int[] nums) {
        int maxi = -1;
        int sec = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= maxi){
                sec = maxi;
                maxi = nums[i];

            }else if(nums[i] <= maxi && nums[i] > sec)sec = nums[i];
        }
        return (maxi - 1) * (sec - 1);
    }
}