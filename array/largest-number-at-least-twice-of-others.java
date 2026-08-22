class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int secMax = -1;
        int indx = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] > max){
                secMax = max;
                max = nums[i];
                indx = i;
            }else if(nums[i] > secMax && nums[i] < max){
                secMax = nums[i];
            }else{
                continue;
            }
        }
        if(secMax * 2 <= max)return indx;
        return -1;
    }
}