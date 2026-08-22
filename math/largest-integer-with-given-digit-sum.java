class Solution {
    public int largestInteger(int n, int s) {
        if(s == 0)return 0;
        if(s > n*9)return -1;
        int val = 0;
        for(int i = 0;i<n;i++){
            int cur = Math.min(s,9);
            val = val * 10 + cur;
            s-=cur;
        }
        return val;
    }
}