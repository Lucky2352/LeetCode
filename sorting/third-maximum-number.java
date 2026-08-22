class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1)return nums[0];
        if(nums.length == 2)return Math.max(nums[0],nums[1]);
        long maxi = Long.MIN_VALUE;
        long sec = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > maxi){
                third = sec;
                sec= maxi;
                maxi = nums[i];
            }else if(nums[i] < maxi && nums[i] > sec){
                third = sec;
                sec = nums[i];
            }else if(nums[i] > third && nums[i] < sec){
                third = nums[i];
            }
        }
        if(third == Long.MIN_VALUE){
            return (int)maxi;
        }
        return (int)third;
    }
}