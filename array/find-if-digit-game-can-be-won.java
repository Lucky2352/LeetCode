class Solution {
    public boolean canAliceWin(int[] nums) {
        int s1 = 0;
        int s2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= 9)s1 += nums[i];
            else{
                s2 += nums[i];
            }
        }
        return !(s1 == s2); 
    }
}