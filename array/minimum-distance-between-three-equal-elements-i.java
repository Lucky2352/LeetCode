class Solution {
    public int minimumDistance(int[] nums) {
        int n = nums.length;
        if(n < 3)return -1;
        int min = Integer.MAX_VALUE;
        int cur = 0;
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i] == nums[j]){ 
                    for(int k = j + 1;k < n;k++){
                        if(nums[k] == nums[j]){
                            cur += Math.abs(k - j) + Math.abs(i - j) + Math.abs(k - i);
                            min = Math.min(cur,min);
                            cur = 0;
                        }
                    }
                }
            }
           
        }
     return min == Integer.MAX_VALUE ? -1 : min;
    }
}