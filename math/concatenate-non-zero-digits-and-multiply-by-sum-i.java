class Solution {
    public long sumAndMultiply(int n) {
        long val = 0;
        long sum = 0;
        int digi = 0;
        while(n > 0){
             digi = n % 10;
            if(digi == 0){
                n /= 10;
            }else{
                val = val * 10 + digi;
                sum += digi;//sum += is same as sum = sum + digi
                n /= 10;
            }
        }
        long rev = 0;
        while(val > 0){
            rev = (rev * 10) + (val % 10);
            val /=10;
        }
        return rev * sum;
    }
}