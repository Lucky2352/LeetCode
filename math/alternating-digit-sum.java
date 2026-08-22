class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        String val = Integer.toString(n);
            for(int i = 0;i<val.length();i++){
                if(i % 2 == 0){
                    sum += val.charAt(i) - '0';
                }else{
                    sum -= val.charAt(i) - '0';
                }
            }
        return sum;
    }
}