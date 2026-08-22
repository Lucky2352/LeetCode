class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int[] check = new int[256];
        int max = 0;
        while(j < s.length()){
            if(check[s.charAt(j)] != 0){
                max = Math.max(max,j - i);
                while(i <= j && s.charAt(i) != s.charAt(j)){
                    check[s.charAt(i)]--;
                    i++;
                }
                check[s.charAt(i)]--;
                    i++;
            }
            check[s.charAt(j)]++;
            j++;
        }
        max = Math.max(max,j - i);
        return max;
    }
}