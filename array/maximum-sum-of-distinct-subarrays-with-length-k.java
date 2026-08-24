class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        for(int i = 0;i<nums.length - k;i++){
            Set<Integer> set = new HashSet<>();
            long cur = 0;
            long count = 0;
            for(int j = i;j<i+k;j++){
                if(!set.contains(nums[j])){
                    cur += nums[j];
                    set.add(nums[j]);
                    count++;
                }else{
                    break;
                }
            }
            if(count == k){
                sum = Math.max(sum,cur);
            }
        }
        return sum;
    }
}