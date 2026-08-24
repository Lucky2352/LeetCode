class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        boolean flag = false;
        if(dividend < 0){
            dividend = Math.abs(dividend);
            flag = !flag;
        }
        if(divisor < 0){
            divisor = Math.abs(divisor);
            flag = !flag;
        }
            int count = 0;
        while(dividend >= divisor){
            count++;
            dividend -= divisor;
        }
        if(flag){
            return 0 - count;
        }
        return count;
    }
}