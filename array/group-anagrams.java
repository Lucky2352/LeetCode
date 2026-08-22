class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].equals("1")) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                int[] freq = new int[26];
                String cur = strs[i];
                for (int p = 0; p < cur.length(); p++) {
                    freq[cur.charAt(p) - 'a']++;
                }
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j].equals("1"))
                        continue;
                    String check = strs[j];
                    if (cur.length() != check.length())
                        continue;
                    int[] temp = freq.clone();
                    for (int p = 0; p < check.length(); p++) {
                        temp[check.charAt(p) - 'a']--;
                    }
                    boolean flag = false;
                    for (int k = 0; k < 26; k++) {
                        if (temp[k] != 0) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        list.add(strs[j]);
                        strs[j] = "1";
                    }
                }
                strs[i] = "1";
                ans.add(list);
            }
        }
        return ans;
    }
}