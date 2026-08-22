class Solution {
    public int elevatorRequests(int n, int[] r) {
        int total = 0;
        int cur = 0;
        for(int i = 0;i<r.length;i++){
            total += Math.abs(cur - r[i]);
            cur = r[i];
        }
        return total;
    }
}