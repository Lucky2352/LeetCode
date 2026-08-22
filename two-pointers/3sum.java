class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
       for(int i = 0;i<nums.length - 1;i++){
        Map<Integer,Integer> map = new HashMap<>();
        for(int j = i+1;j < nums.length;j++){
            List<Integer> list = new ArrayList<>();
            int find = 0 - (nums[i] + nums[j]);
            if(map.containsKey(find)){     
                list.add(nums[i]);
                list.add(find);
                list.add(nums[j]);
                Collections.sort(list);
                ans.add(list);
            }
            map.put(nums[j],j);
        }
       }       
       return new ArrayList<>(ans);
    }
}