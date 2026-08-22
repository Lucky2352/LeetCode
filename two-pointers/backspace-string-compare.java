class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0) {
            int counts = 0;
            int countt = 0;
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    counts++;
                    i--;
                } else if (counts > 0) {
                    counts--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    countt++;
                    j--;
                } else if (countt > 0) {
                    countt--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                if (s.charAt(i) != t.charAt(j))
                    return false;
            } else if (i != j) {
                return false;
            }

            i--;
            j--;
        }
        return true;
    }
}