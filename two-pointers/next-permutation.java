class Solution {
    public static void rev(int[] nums,int st,int end){
        while(st < end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int indx = -1;
        for(int i = nums.length - 1;i>0;i--){
            if(nums[i - 1] < nums[i]){
                indx = i - 1;
                break;
            }
        }
        if(indx == -1){
            rev(nums,0,nums.length - 1);
            return;
        }
        for(int i = nums.length - 1;i >indx;i--){
                if(nums[i] > nums[indx]){
                    int temp = nums[indx];
                    nums[indx] = nums[i];
                    nums[i] = temp;
                    break;
                }
        }

        rev(nums,indx + 1,nums.length - 1);
    }
}