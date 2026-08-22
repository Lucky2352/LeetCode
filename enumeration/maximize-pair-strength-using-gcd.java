class Solution {
    public static long gcds(int a,int b){
        long maxi = 0;
        long mini = 0;
        if(a > b){
            maxi = a;
            mini = b;
        }else{
            maxi = b;
            mini = a;
        }
        long gcd = 1;
        while(mini != 0){
            long rem = maxi % mini;
            maxi = mini;
            mini = rem;
            if(rem == 0){
                gcd = maxi;
                break;
            }
        }
        return gcd;
    }
    public long maxPairStrength(int[] nums) {
        long maxi = Long.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                long gc = gcds(nums[i],nums[j]);
                long prod = 1L * nums[i] * nums[j];
                maxi = Math.max(maxi,(prod)/(gc * gc));
            }
        }
        return maxi;
    }
}