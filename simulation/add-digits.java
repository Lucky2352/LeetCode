class Solution {
    public int addDigits(int num) {
        while(num > 9){
           int cur = num;
           int nv = 0;
           while(cur > 0){
            nv += cur % 10;
            cur /= 10; 
           }
           num = nv;
        }
        return num;
    }
}