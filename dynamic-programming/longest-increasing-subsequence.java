class Solution {
    int len = 0;
    public void recursion(int nums[], int i, List<Integer> list) {
        if (i == nums.length) {
            len = Math.max(len, list.size());
            return;
        }
        if (list.size() == 0 || list.get(list.size() - 1) < nums[i]) {
            list.add(nums[i]);
            recursion(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
        recursion(nums, i + 1, list);
    }

    public int lengthOfLIS(int[] nums) {
        recursion(nums, 0, new ArrayList<>());
        return len;
    }
}