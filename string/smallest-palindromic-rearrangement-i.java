class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        char[] ans = new char[s.length()];
        int left = 0, right = s.length() - 1;

        for (int i = 0; i < 26; i++) {
            while (freq[i] >= 2) {
                ans[left++] = (char) (i + 'a');
                ans[right--] = (char) (i + 'a');
                freq[i] -= 2;
            }
            if (freq[i] == 1) {
                ans[s.length() / 2] = (char) (i + 'a');
            }
        }
        return new String(ans);
    }
}