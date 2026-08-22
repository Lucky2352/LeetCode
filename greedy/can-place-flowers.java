class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if (n == 0) return true;
        if (f.length == 1) {
            return (f[0] == 0 && n <= 1) || n == 0;
        }
        if (f[0] == 0 && f[1] == 0) {
            f[0] = 1;
            n--;
        }
        for (int i = 1; i < f.length - 1; i++) {
            if (f[i] == 0) {
                if (f[i - 1] == 0 && f[i + 1] == 0) {
                    f[i] = 1;
                    n--;
                }
            }
        }
        if (f[f.length - 1] == 0 && f[f.length - 2] == 0) {
            f[f.length - 1] = 1;
            n--;
        }
        return n <= 0;
    }
}