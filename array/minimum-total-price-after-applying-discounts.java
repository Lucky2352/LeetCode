class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length - 1;
        int j = discounts.length - 1;
        double price = 0;
        while(j >= 0 && i >= 0){
            price += (prices[i] * (100 - discounts[j])/100.0);
            i--;
            j--;
        }
        while(i >= 0){
            price += prices[i];
            i--;
        }
        return price;
    }
}