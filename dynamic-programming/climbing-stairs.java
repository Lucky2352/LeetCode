class Solution {
    int count = 0;
    public void recursion(int i,int n){
        if(i == n){
            count++;
            return;
        }
        recursion(i+1,n);
        if(i + 2 <= n){
            recursion(i+2,n);
        }
    }
    public int climbStairs(int n) {
        recursion(0,n);
        return count;
    }
}