class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int[] nums = new int[4*nums1.length];
        int o = 0;
        for(int i = 0;i<nums1.length;i++){
            nums[o] = nums1[i];
            nums[o+1] = nums2[i];
            nums[o+2] = nums3[i];
            nums[o+3] = nums4[i];
            o += 3;
        }
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length - 3;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j = i + 1;j < nums.length - 2;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int p = j + 1;
                int q = nums.length - 1;
                while(p < q){
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        while (p < q && nums[p] == nums[p - 1]) p++;
                        while (p < q && nums[q] == nums[q + 1]) q--;

                    }else if(sum < target)p++;
                    else{
                        q--;
                    }
                }
                
            }
        }
        return ans.size();

    }
}