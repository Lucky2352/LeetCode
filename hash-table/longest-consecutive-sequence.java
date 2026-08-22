class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxi = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int val = num;
                int count = 1;
                while (set.contains(val + 1)) {
                    val++;
                    count++;
                }
                maxi = Math.max(maxi, count);
            }
        }
        return maxi;
    }
}