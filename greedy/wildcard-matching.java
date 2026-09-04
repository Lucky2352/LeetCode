class Solution {
    public static boolean recursion(int i, int j, String s, String p) {
        if (i == s.length() && j == p.length()) {
            return true;
        }
        if (j == p.length()) {
            return false;
        }
        if (i == s.length()) {
            while (j < p.length()) {
                if (p.charAt(j) != '*') {
                    return false;
                }
                j++;
            }
            return true;
        }
        if (p.charAt(j) == '?') {
            return recursion(i + 1, j + 1, s, p);
        }
        if (p.charAt(j) == '*') {
            return recursion(i, j + 1, s, p) ||
                   recursion(i + 1, j, s, p);
        }
        if (p.charAt(j) == s.charAt(i)) {
            return recursion(i + 1, j + 1, s, p);
        }
        return false;
    }

    public boolean isMatch(String s, String p) {
        return recursion(0, 0, s, p);
    }
}