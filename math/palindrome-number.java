class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int num = 0;
        int copy = x;
        while(copy > 0){
            num = num * 10 + (copy % 10);
            copy /= 10;
        }
        return num == x;
    }
}