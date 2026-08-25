class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int p = 1;
        for(int i = 1;k * i <= 100;i++){
            if(!set.contains(k * i))return k*i;
            p++;
        }
        return p*k;
    }
}