class Solution {
    public String restoreString(String s, int[] indices) {
        Character[] arr = new Character[s.length()];
        String sb = "";
        for(int i = 0;i<s.length();i++){
            arr[indices[i]] = s.charAt(i);
        }
        for(int i = 0;i<s.length();i++){
            sb +=arr[i];
        }
        return sb;
    }
}