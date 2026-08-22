class Solution {
    public int maxDistance(String s) {
        int x = 0;
        int y = 0;
        int k = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                x--;
            }
            else if(s.charAt(i) == 'R'){
                x++;
            }
            else if(s.charAt(i) == 'U'){
                y++;
            }
            else if(s.charAt(i) == 'D'){
                y--;
            }
            else{
                k++;
            }
        }
        return Math.abs(x) + Math.abs(y) + k;
    }
}