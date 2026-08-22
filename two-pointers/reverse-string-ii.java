class Solution {
    public String reverseStr(String s, int k) {
       int len = s.length();
       char[] ch = s.toCharArray();
       for(int i = 0;i < len;i += 2*k){
        int left = i;
        int right = Math.min(i + k - 1,len - 1);
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            right--;
            left++;
        }
       }
       return String.valueOf(ch);
    }
}