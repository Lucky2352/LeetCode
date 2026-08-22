class Solution {
    public static int fd(long n) {
        while (n >= 10) {
            n /= 10;
        }
        return (int) n;
    }
    public static int ld(long n) {
        return (int) (n % 10);
    }
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (fd(sum) == x && ld(sum) == x) {
                    count++;
                }
            }
        }
        return count;
    }
}