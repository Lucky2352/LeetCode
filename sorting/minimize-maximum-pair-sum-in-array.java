class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
     int i = 0;
     int j = nums.length - 1;
     int maxi = 0;
     while(i < j){
        int sum = nums[i] + nums[j];
        i++;
        j--;
        maxi = Math.max(sum,maxi);
     }
     return maxi;
    }
}