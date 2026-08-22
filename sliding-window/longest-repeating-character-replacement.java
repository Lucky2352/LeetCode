class Solution {
    public int characterReplacement(String s, int k) {
        int hash[] = new int[26];
        int i = 0;
        int j = 0;
        int maxi = 0;
        int len = 0;
        int maxFreq = 0;
        while(j < s.length()){
            hash[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq,hash[s.charAt(j) - 'A']);
            len++;
            j++;
            if((len - maxFreq) <= k){
                maxi = Math.max(maxi,j - i);
            }else{
                while(i <= j && (len - maxFreq) > k){
                    hash[s.charAt(i) - 'A']--;
                    len--;
                    i++;
                }
               maxi = Math.max(maxi,j - i); 
            }
        }
        return maxi;
    }
}