class Solution {
    public boolean checkZeroOnes(String s) {
        int cur0 = 0;
        int cur1 = 0;
        int max1 = 0;
        int max0 = 0;
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i) - '0') == 0){
                max1 = Math.max(max1,cur1);
                cur1 = 0;
                cur0++;
            }else{
                max0 = Math.max(max0,cur0);
                cur0 = 0;
                cur1++;
            }
        }
        max0 = Math.max(max0,cur0);
        max1 = Math.max(max1,cur1);
        return max1 > max0;
    }
}