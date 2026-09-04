class Solution {
    int len = Integer.MIN_VALUE
    public void recursion(int nums[], int i, List<Integer> list, int[] dp) {
        if (i == nums.length) {
            len = Math.max(len, list.size());
            return;
        }
        if (dp[i] != -1) {
            return;
        }
        if (list.size() == 0 || list.get(list.size() - 1) < nums[i]) {
            list.add(nums[i]);
            recursion(nums, i + 1, list, dp);
            list.remove(list.size() - 1);
        }
        recursion(nums, i + 1, list, dp);
        dp[i] = len;
    }

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        recursion(nums, 0, new ArrayList<>(), dp);
        return len;
    }
}