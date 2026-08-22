class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 2;
        for(int i = 2;i < nums.length;i++){
            if(nums[i] != nums[ptr - 2]){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}