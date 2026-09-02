class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int i = nums.size() / 2 - 1;
        int j = nums.size() - 1;
        int count = 0;
        while (i >= 0 && j >= nums.size() / 2) {
            if (nums.get(i) < nums.get(j)) {
                count += 2;
                i--;
                j--;
            } else {
                j--;
            }
        }
        return nums.size() - count;
    }
}