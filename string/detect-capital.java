class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)count++;
        }
        if(word.length() != 1 && count == 1){
            if(word.charAt(0) >= 65 && word.charAt(0) <= 90)return true;
            else{
                return false;
            }
        }
        return (count == 0 || count == word.length());
    }
}