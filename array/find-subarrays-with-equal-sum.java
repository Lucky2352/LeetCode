class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = nums[0] + nums[1];
        set.add(sum);
        for(int i = 2;i<nums.length;i++){
            int cur = nums[i - 1] + nums[i];
            if(set.contains(cur))return true;
            set.add(cur);
        }
        return false;
    }
}