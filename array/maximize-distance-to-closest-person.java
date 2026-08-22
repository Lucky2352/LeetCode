class Solution {
    public int maxDistToClosest(int[] s) {
        int maxi = 0;
        int i = 0;
        int j = 0;
        while (i < s.length) {
            if (s[i] != 0) {
                break;
            }
            i++;
        }
        maxi = i;
        j = i;
        while (i < s.length && j < s.length) {
            while (j < s.length && s[j] == 1) {
                j++;
            }
            i = j;
            while (j < s.length && s[j] == 0) {
                j++;
            }
            int len = j - i;
            if (j == s.length) {
                maxi = Math.max(maxi, len);
            } else {
                maxi = Math.max(maxi, (len + 1) / 2);
            }
            i = j;
        }
        return maxi;
    }
}