class Solution {
    public static long psb(long n){
        return (n * (n + 1))/2;
    }
    public int arrangeCoins(int n) {
        int low = 0;
        int high = n;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(psb(mid) <= n){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}