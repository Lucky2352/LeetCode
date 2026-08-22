class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] all = new int[26];
        int count = 0;
        for(int i = 0;i<allowed.length();i++){
            all[allowed.charAt(i) - 'a'] = 1;
        }
        for(String s : words){
            boolean flag = false;
            for(int i = 0;i<s.length();i++){
                if(all[s.charAt(i) - 'a'] != 1){
                    flag = true;
                    break;
                }
            }
            if(!flag)count++;
        }
        return count;
    }
}