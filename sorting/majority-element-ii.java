class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cur1 = 0;
        int cur2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(count1 == 0 && cur2 != nums[i]){
                cur1 = nums[i];
                count1++;
            }
             else if(count2 == 0 && cur1 != nums[i]){
                cur2 = nums[i];
                count2++;
            }
            else if(cur1 == nums[i]){
                count1++;
            }else if(cur2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }

        }
        int c1 = 0;
        int c2 = 0;
        for(int num : nums){
            if(num == cur1){
                c1++;
            }else if(num == cur2){
                c2++;
            }else{
                continue;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(c2 > nums.length/3){
            list.add(cur2);
        }
        if(c1 > nums.length/3){
            list.add(cur1);
        }
        return list;
    }
}