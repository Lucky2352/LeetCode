class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i = 0;
        int j = tokens.length - 1;
        if(tokens.length == 1 && tokens[i] > power)return 0;
        if(tokens.length == 1 && tokens[i] <= power)return 1;
        Arrays.sort(tokens);
        int max = 0;
        int cur = 0;
        while(i <= j){
            if(tokens[i] <= power){
                power -= tokens[i];
                i++;
                cur++;
            }else{
                if(cur > 0){
                    max = Math.max(max,cur);
                cur--;
                power += tokens[j];
                j--;
                }
                else{
                    return max;
                }
                
            }
        }
        return Math.max(cur,max);
    }
}