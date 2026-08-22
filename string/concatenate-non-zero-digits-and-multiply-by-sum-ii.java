class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        int n = s.length();
        int[] nums = new int[n];
        long[] generate = new long[n];
        int[] place = new int[n];
        int[] ans = new int[queries.length];
        long val = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += s.charAt(i) - '0';
            nums[i] = sum;

            if (s.charAt(i) != '0') {
                val = (val * 10 + (s.charAt(i) - '0')) % MOD;
                generate[i] = val;
                count++;
                place[i] = count;
            } else {
                generate[i] = val;
                place[i] = count;
            }
        }
        long[] pow10 = new long[count + 1];
        pow10[0] = 1;
        for (int i = 1; i <= count; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        for (int i = 0; i < queries.length; i++) {

            int min = queries[i][0];
            int max = queries[i][1];

            int pref_sum;

            if (min == 0) {
                pref_sum = nums[max];
                ans[i] = (int) ((1L * pref_sum * generate[max]) % MOD);
            } else {

                pref_sum = nums[max] - nums[min - 1];
                long cur = (generate[max]
                        - (generate[min - 1] * pow10[place[max] - place[min - 1]]) % MOD
                        + MOD) % MOD;
                ans[i] = (int) ((cur * pref_sum) % MOD);
            }
        }

        return ans;
    }
}