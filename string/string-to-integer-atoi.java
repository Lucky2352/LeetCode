class Solution {

    public int recursion(int index, String s, int sign, long val) {
        if (index == s.length() || !Character.isDigit(s.charAt(index))) {
            return (int) (val * sign);
        }
        val = val * 10 + (s.charAt(index) - '0');
        if (val * sign <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (val * sign >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return recursion(index + 1, s, sign, val);
    }
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i == s.length()) return 0;
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }
        if (i == s.length() || !Character.isDigit(s.charAt(i))) {
            return 0;
        }
        return recursion(i, s, sign, 0);
    }
}