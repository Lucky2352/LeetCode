class Solution {
    public int largestAltitude(int[] gain) {
        int val = 0;
        int min = Integer.MIN_VALUE;
        for(int i : gain){
            val += i;
            min = Math.max(val,min);
                   }
                   if(min < 0)return 0;
        return min;
    }
}