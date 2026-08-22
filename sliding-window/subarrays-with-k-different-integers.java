class Solution {
    public static int atMost(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int count = 0;
        while(j < nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            j++;
            while (i < j && map.size() > k) {
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            count += j - i;
            
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
}