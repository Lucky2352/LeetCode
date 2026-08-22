class Solution {
    public int singleNumber(int[] nums) {
        int uniq = 0;
        for(int i = 0;i<nums.length;i++){
            uniq ^= nums[i];
        }
        return uniq;
    }
}