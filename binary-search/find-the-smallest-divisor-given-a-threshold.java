class Solution {
    public static int div(int[] arr,int a,int threshold){
        int sum = 0;
    for (int valee : arr) {
        if(valee % a == 0){
            sum += valee/a;
        }else{
            sum += (valee/a)+1;
        }    
        if(sum > threshold)return sum;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(div(nums,mid,threshold) <= threshold){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}