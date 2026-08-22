class Solution {
    public static boolean check(int[] nums, int m, int k,int val){
        int need = k;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] <= val){
                need--;
            }else{
                need = k;
            }
            if(need == 0){
                count++;
                need = k;
            }
        }
        return count >= m;
    }
    public int minDays(int[] nums, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        for(int num : nums){
            if(num > high)high = num;
            if(num < low)low = num;
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(check(nums,m,k,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return ans;
    }
}