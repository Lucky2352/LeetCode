class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        StringBuilder sb = new StringBuilder("");
        sb.append(s.charAt(0));
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            int k = i;
            while (j >= 0 && k < s.length()) {
                if (s.charAt(j) != s.charAt(k)) {
                    if (k - j - 1 > max) {
                        sb.setLength(0);
                        sb.append(s.substring(j + 1, k));
                        max = k - j - 1;
                    }
                    break;
                } else {
                    j--;
                    k++;
                }
            }
            if (j < 0 || k == s.length()) {
                if (k - j - 1 > max) {
                    sb.setLength(0);
                    sb.append(s.substring(j + 1, k));
                    max = k - j - 1;
                }
            }
            j = i;
            k = i + 1;
            while (j >= 0 && k < s.length()) {
                if (s.charAt(j) != s.charAt(k)) {
                    if (k - j - 1 > max) {
                        sb.setLength(0);
                        sb.append(s.substring(j + 1, k));
                        max = k - j - 1;
                    }
                    break;
                } else {
                    j--;
                    k++;
                }
            }

            if (j < 0 || k == s.length()) {
                if (k - j - 1 > max) {
                    sb.setLength(0);
                    sb.append(s.substring(j + 1, k));
                    max = k - j - 1;
                }
            }
        }
        return sb.toString();
    }
}