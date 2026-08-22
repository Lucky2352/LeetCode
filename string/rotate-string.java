class Solution {
    public boolean rotateString(String s, String g) {
        if(s.length() != g.length())return false;
        String newstr  = g + g;
        return newstr.contains(s);
    }
}