class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] f1 = new int[256];
        int[] f2 = new int[256];
        for(int i = 0;i<s.length();i++){
            if(f1[s.charAt(i)] == 0 && f2[t.charAt(i)] == 0){
                f1[s.charAt(i)] = t.charAt(i);
                f2[t.charAt(i)] = s.charAt(i);
            }else{
                if(f1[s.charAt(i)] != t.charAt(i) || f2[t.charAt(i)] != s.charAt(i))return false;
            }
        }
        return true;
    }
}