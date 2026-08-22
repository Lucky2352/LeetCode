class Solution {
    public long maximumValue(int n, int s, int m) {
        long psb = n / 2;
        if(psb == 0)return s;

        return (long) s + m + (psb - 1) * (long)(m - 1);
    }
}