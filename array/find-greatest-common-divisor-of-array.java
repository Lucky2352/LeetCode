class Solution {
    public static int gcd(int a,int b){
        int maxi = Math.max(a,b);
        int mini = Math.min(a,b);
        while(mini != 0){
            int rem = maxi % mini;
            maxi = mini;
            mini = rem; 
        }
        return maxi;
    }
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > maxi)maxi = nums[i];
            if(nums[i] < mini) mini = nums[i];
        }
        return gcd(maxi,mini);
    }
}