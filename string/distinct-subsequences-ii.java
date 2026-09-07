class Solution {
    int MOD = 1000000007;
    HashSet<String> set = new HashSet<>();
    public void recursion(int i, char[] chars, String p) {
        if (i == chars.length) {
            if (p.length() != 0) {
                set.add(p);
            }
            return;
        }
        recursion(i + 1, chars, p + chars[i]);
        recursion(i + 1, chars, p);
    }

    public int distinctSubseqII(String s) {
        char[] chars = s.toCharArray();
        recursion(0, chars, "");
        return set.size() % MOD;
    }
}