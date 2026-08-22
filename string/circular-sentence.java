class Solution {
    public boolean isCircularSentence(String sen) {
        for(int i = 0;i<sen.length();i++){
            if(sen.charAt(i) == ' '){
                if(sen.charAt(i - 1) != sen.charAt(i + 1))return false;
            }
        }
        return sen.charAt(sen.length() - 1) == sen.charAt(0);
    }
}