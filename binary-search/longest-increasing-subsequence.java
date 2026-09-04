class Solution {
    int len = Integer.MIN_VALUE;
    public void recursion(int nums[], int i, List<Integer> list, int[][] dp, int prev) {
        if (i == nums.length) {
            len = Math.max(len, list.size());
            return;
        }
        if (dp[i][prev + 1] != -1) {
            return;
        }
        if (prev == -1 || nums[prev] < nums[i]) {
            list.add(nums[i]);
            recursion(nums, i + 1, list, dp, i);
            list.remove(list.size() - 1);
        }
        recursion(nums, i + 1, list, dp, prev);
        dp[i][prev + 1] = len;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        recursion(nums, 0, new ArrayList<>(), dp, -1);
        return len;
    }
}