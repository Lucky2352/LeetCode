class Solution {
    public static int gcd(int a,int b){
        int maxi = 0;
        int mini = 0;
        if(a > b){
            maxi = a;
            mini = b;
        }else{
            maxi = b;
            mini = a;
        }
        int gcd = 1;
        while(mini != 0){
            int rem = maxi % mini;
            maxi = mini;
            mini = rem;
            if(rem == 0){
                gcd = maxi;
                break;
           }
        }
        return gcd;
    }
    public long gcdSum(int[] nums) {
        int[] gcd = new int[nums.length];
        int max = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            gcd[i] = gcd(nums[i],max);  
        }
        Arrays.sort(gcd);
        int i = 0;
        int j = nums.length - 1;
        long sum = 0;
        while(i < j){
            sum +=gcd(gcd[i],gcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}