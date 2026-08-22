class Solution {
    public int minimumCost(int[] nums, int k) {
        long cur = k;
        long cost = 0;
        long op = 0;
        long mod = 1000000007;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= cur){
                cur -= nums[i];
            }else{
               long want = (nums[i] - cur + k - 1)/k;
                long a  = want;
                long b = 2 * op + want + 1;
                if(a % 2 == 0){
                    a /= 2;
                }else{
                    b/=2;
                }
                long sum = ((a % mod)* (b % mod)) % mod;
                cost = (cost +sum) % mod;
                op += want;
                cur += want *(long)k;
                cur -= nums[i];
            }
        }
        return (int)cost;
    }
}