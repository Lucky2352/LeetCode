class Solution {
    public int maxProduct(int n) {
        int maxi = Integer.MIN_VALUE;
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MIN_VALUE;
        while(n != 0){
            int digi = n % 10;
            if(val1 == Integer.MIN_VALUE && val2 == Integer.MIN_VALUE){
                val1 = digi;
            }else if(digi > val1){
                val2 = val1;
                val1 = digi;
            }
            else if(digi == val1){
                val2 = digi;
            }else if(digi < val1 && digi > val2){
                val2 = digi;
            }
            n /= 10;
        }
        return val1 * val2;
    }
}