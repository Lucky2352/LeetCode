class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        int i = 0;
        int count = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) == typed.charAt(j)) {
                char ch = name.charAt(i);
                count = 0;
                while (j < typed.length() && typed.charAt(j) == ch) {
                    count++;
                    j++;
                }
                while (i < name.length() && name.charAt(i) == ch) {
                    count--;
                    i++;
                }
                if (count < 0)
                    return false;

            } else {
                return false;
            }
        }
        return i == name.length() && j == typed.length();
    }
}