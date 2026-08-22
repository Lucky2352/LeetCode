class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        while(low <= high){
            int mid = low + (high - low)/2;
            long ans = (long)mid * (long)mid;
            if(ans == num){
                return true;
            }else if(ans > num){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}