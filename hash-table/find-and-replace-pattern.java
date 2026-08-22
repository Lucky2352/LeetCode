class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String check = words[i];
            boolean flag = true;
            int[] arr = new int[256];
            int[] prr = new int[256];
            int j = 0;
            while (j < pattern.length()) {
                if (arr[pattern.charAt(j)] == 0 && prr[check.charAt(j)] == 0) {
                    arr[pattern.charAt(j)] = check.charAt(j);
                    prr[check.charAt(j)] = pattern.charAt(j);
                }
                if (arr[pattern.charAt(j)] != check.charAt(j) ||
                    prr[check.charAt(j)] != pattern.charAt(j)) {
                    flag = false;
                    break;
                }
                j++;
            }
            if (flag) {
                list.add(check);
            }
        }
        return list;
    }
}