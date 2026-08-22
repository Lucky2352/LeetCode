class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k == nums.length){
            int ans = nums[0];
            for(int i = 1; i < nums.length; i++){
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        }
        if(k == 1){
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            int ans = -1;
            for(int i = 0; i < nums.length; i++){
                if(map.get(nums[i]) == 1){
                    ans = Math.max(ans, nums[i]);
                }
            }
            return ans;
        }
        int c1 = 0;
        int c2 = 0;
        int p1 = nums[0];
        int p2 = nums[nums.length - 1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == p1){
                c1++;
            }
            if(nums[i] == p2){
                c2++;
            }
        }
        if(p1 == p2){
            return -1;
        }
        if(c1 == 1 && c2 == 1){
            return Math.max(p1, p2);
        }
        if(c1 > 1 && c2 > 1){
            return -1;
        }
        if(c1 == 1){
            return p1;
        }
        return p2;
    }
}