class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder("");
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 && j >= 0){
            int d1 = num1.charAt(i) - '0';
            int d2 = num2.charAt(j) - '0';
            i--;
            j--;
            int sum = d1 + d2 + carry;
            carry = sum/10;
            sb.append(sum % 10);
        }
        while(i >=0){
            int d1 = num1.charAt(i) - '0';
            int sum = d1 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
        }
        while(j >=0){
            int d1 = num2.charAt(j) - '0';
            int sum = d1 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            j--;
        }
        if(carry != 0)sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}