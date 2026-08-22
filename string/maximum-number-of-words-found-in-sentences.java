class Solution {
    public int mostWordsFound(String[] sen) {
        int maxi = 0;
        for(String s : sen){
            int count = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i) == ' ')count++;
            }
            maxi = Math.max(count + 1,maxi);
        }
        return maxi;
    }
}