class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int j = 0;
        int maxi = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            while (freq[s.charAt(i) - 'a'] > 2) {
                freq[s.charAt(j) - 'a']--;
                j++;
            }
            maxi = Math.max(maxi, i - j + 1);
        }
        return maxi;
    }
}