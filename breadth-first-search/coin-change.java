class Solution {
    int min = Integer.MAX_VALUE;
    public void recursion(int i,int[] coins,int target,int count){
        if(i == coins.length){
            if(target == 0){
                min = Math.min(count,min);
                return;
            }
            return;
        }
        if(target - coins[i] >= 0){
            recursion(i,coins,target - coins[i],count + 1);
        }
        recursion(i+1,coins,target,count);

    }
    public int coinChange(int[] coins, int amount) {
        recursion(0,coins,amount,0);
        if(min == Integer.MAX_VALUE)return -1;
        return min;
    }
}