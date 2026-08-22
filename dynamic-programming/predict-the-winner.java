class Solution {
    public boolean recursion(int st, int end, int[] nums, int p1, int p2, boolean turn) {
        if (st > end) {
            return p1 >= p2;
        }
        if (turn) {
            return recursion(st + 1, end, nums, p1 + nums[st], p2, false) ||
                   recursion(st, end - 1, nums, p1 + nums[end], p2, false);
        } else {
            return recursion(st + 1, end, nums, p1, p2 + nums[st], true) &&
                   recursion(st, end - 1, nums, p1, p2 + nums[end], true);
        }
    }

    public boolean predictTheWinner(int[] nums) {
        return recursion(0, nums.length - 1, nums, 0, 0, true);
    }
}