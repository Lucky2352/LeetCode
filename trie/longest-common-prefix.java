class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String pref = strs[0];
        String sref = strs[strs.length - 1];
        int i = 0;
        while (i < pref.length() && i < sref.length()
                && pref.charAt(i) == sref.charAt(i)) {
            i++;
        }
        return pref.substring(0, i);
    }
}
