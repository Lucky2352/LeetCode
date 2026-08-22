class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0;
       int maximum = 0;
       for(int i = 0;i<=nums.length - 1;i++){
            if(nums[i] == 0){
                maximum = Math.max(maximum,count);
                count = 0;

            }else{
                count++;
            }
       }
       return Math.max(maximum,count);
    }
}