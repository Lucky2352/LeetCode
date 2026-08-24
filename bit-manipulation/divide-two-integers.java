class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int sign = 1;
        if(dividend < 0){
            dividend *= -1;
            sign *= -1;
        }
        if(divisor < 0){
            divisor *= -1;
            sign  *= -1;
        }
            int count = 0;
        while(dividend >= divisor){
            count++;
            dividend -= divisor;
        }
        return sign * count;
    }
}