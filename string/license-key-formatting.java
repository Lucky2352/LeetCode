class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') count++;
        }
        int first = count % k;
        StringBuilder sb = new StringBuilder("");
        if (first == 0) {
            int cur = k;
            for (int i = 0; i < s.length(); i++) {
                if (cur > 0) {
                    if (s.charAt(i) != '-') {
                        sb.append(Character.toUpperCase(s.charAt(i)));
                        cur--;
                    }
                } else {
                    if (s.charAt(i) == '-') continue;

                    sb.append('-');
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    cur = k - 1;
                }
            }
        } else {
            int cur = first;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '-') continue;
                if (cur > 0) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    cur--;
                } else {
                    sb.append('-');
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    cur = k - 1;
                }
            }
        }
        return sb.toString();
    }
}