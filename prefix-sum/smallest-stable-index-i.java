class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        forward[0] = nums[0];
        int maxi = nums[0];
        for(int i = 1;i<nums.length;i++){
            forward[i] = Math.max(maxi,nums[i]);
            maxi = Math.max(maxi,nums[i]);
        }

        backward[nums.length - 1] = nums[nums.length - 1];
        int mini = nums[nums.length - 1];

        for(int i = nums.length - 2;i>=0;i--){
            backward[i] = Math.min(nums[i],mini);
            mini = Math.min(nums[i],mini);
        }

        for(int i = 0;i<nums.length;i++){
            if((forward[i] - backward[i]) <= k){
                System.out.println(forward[i] - backward[i]);
                System.out.println(forward[i] +" "+ backward[i]);
                return i; 
            }
        }
        return -1;
    }
}