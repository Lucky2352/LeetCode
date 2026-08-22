class Solution {
    public int maxProfit(int[] prices) {
        int a = 1;
        int profit = 0;
        while(a < prices.length) {
            if(prices[a - 1] < prices[a]) {
                profit += prices[a] - prices[a - 1];
            }
            a++;
        }
        return profit;
    }
}