class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int i = cost.length - 1;
        if(i == 0)return cost[0];
        if(i == 1)return cost[0] + cost[1];
        while(i >= 0){
            if(i == 0){
                sum += cost[0];
                i--;
            }
            else{
                sum += cost[i] + cost[i - 1];
                i -= 3;
            }
        }
        return sum;
    }
}