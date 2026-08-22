class Solution {
    public int minBitFlips(int start, int goal) {
        if(start == goal)return 0;
        int val = start ^ goal;
        int count = 0;
        while(val > 1){
            if((val % 2) == 1)count++;
            val /= 2;
        }
        count++;
        return count;
    }
}