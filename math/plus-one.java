class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1;i>=0;i--){
            if( i == digits.length - 1){
                digits[i] = digits[i] + 1 + carry;
            }else{
                digits[i] = digits[i] + carry;
            }
            if(digits[i] > 9){
                digits[i] = 0;
                carry = 1;
            }else{
                carry = 0;
            }
            if(carry == 0){
                return digits;
            }
        }
        int prr[] = new int[digits.length + 1];
        prr[0] = 1;
        return prr;
    }
}