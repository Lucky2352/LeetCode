class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] check = new int[right + 1];
        for (int i = 2; i * i <= right; i++) {
            if (check[i] == 0) {
                for (int j = i * i; j <= right; j += i) {
                    check[j] = 1;
                }
            }
        }
        int min = Integer.MAX_VALUE;
        int cur1 = -1;
        int cur2 = -1;
        int ans1 = -1;
        int ans2 = -1;
        for (int i = left; i <= right; i++) {
            if (i >= 2 && check[i] == 0) {
                cur1 = cur2;
                cur2 = i;
                if (cur1 != -1 && cur2 - cur1 < min) {
                    min = cur2 - cur1;
                    ans1 = cur1;
                    ans2 = cur2;
                }
            }
        }
        return new int[]{ans1, ans2};
    }
}