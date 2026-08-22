class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int st = 0;
        for (int i = 1; i < nums.length; i++) {
            // long use krna pdega overflow edge case
            if ((long) nums[i] - (long) nums[i - 1] != 1) {
                StringBuilder sb = new StringBuilder();
                if (nums[st] == nums[i - 1]) {
                    sb.append(nums[st]);
                } else {
                    sb.append(nums[st]);
                    sb.append("->");
                    sb.append(nums[i - 1]);
                }
                list.add(sb.toString());
                st = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (nums[st] == nums[nums.length - 1]) {
            sb.append(nums[st]);
        } else {
            sb.append(nums[st]);
            sb.append("->");
            sb.append(nums[nums.length - 1]);
        }
        list.add(sb.toString());
        return list;
    }
}