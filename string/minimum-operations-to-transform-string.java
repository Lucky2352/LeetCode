class Solution {
    public int minOperations(String s) {
        char check = 'z';
        for(char c: s.toCharArray()){
            if(c != 'a'){
                check = (char)Math.min(c,check);
            }
        }
        if(check == 'z')return 0;
        return check - 'a';
    }
}