class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) return 1;
        char cur = chars[0];
        int count = 1;
        int i = 0;
        int j = 1;
        while (j < chars.length) {
            if (chars[j] == cur) {
                count++;
                j++;
            } else {
                chars[i++] = cur;
                if (count > 1) {
                    char[] arr = String.valueOf(count).toCharArray();
                    for (char c : arr) {
                        chars[i++] = c;
                    }
                }
                cur = chars[j];
                count = 1;
                j++;
            }
        }
        chars[i++] = cur;
        if (count > 1) {
            char[] arr = String.valueOf(count).toCharArray();
            for (char c : arr) {
                chars[i++] = c;
            }
        }
        
        return i;
    }
}