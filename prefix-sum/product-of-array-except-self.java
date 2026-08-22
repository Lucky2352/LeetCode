class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int prod = 1;
        for(int i : nums){
            if(i == 0){
                count++;
            }else{
                prod *= i;
            }
        }
        if(count > 1){
            int arr[] = new int[nums.length];
            return arr;
        }else if(count == 1){
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == 0)nums[i] = prod;
                else{
                    nums[i] = 0;
                }
            }
        }
        else{
            for(int i = 0;i<nums.length;i++){
                nums[i] = prod/nums[i];
            }
        }
        
        
        return nums;
    }
}