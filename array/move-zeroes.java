class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        if(nums.length == 1 || nums.length == 0 )return;
        while(j < nums.length && i < nums.length){
             if(nums[j] != 0 && nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else if(nums[i] == 0 &&  nums[j] == 0 ){ 
                j++;
            }else{
                i++;
                j++;
            }
        }
    }
}