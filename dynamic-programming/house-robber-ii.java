class Solution {
    public static int recursion(int[] nums) {
        int prev2 = nums[1];
        int prev1 = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            int pick = nums[i] + prev2;
            int notPick = prev1;
            int current = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static int recursion2(int[] nums) {
        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length - 1; i++) {

            int pick = nums[i] + prev2;
            int notPick = prev1;

            int current = Math.max(pick, notPick);

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(recursion2(nums), recursion(nums));
    }
}