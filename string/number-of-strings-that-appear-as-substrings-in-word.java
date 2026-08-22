class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (int i = 0; i < patterns.length; i++) {
            String check = patterns[i];
            int p = 0;
            int q = 0;
            int count = 0;
            int start = 0;
            while (start <= word.length() - check.length()) {
                p = 0;
                q = start;
                count = 0;
                while (p < check.length() && q < word.length()) {
                    if (check.charAt(p) == word.charAt(q)) {
                        count++;
                        p++;
                        q++;
                    } else {
                        break;
                    }
                }
                if (count == check.length()) {
                    ans++;
                    break;
                }
                start++;
            }
        }
        return ans;
    }
}