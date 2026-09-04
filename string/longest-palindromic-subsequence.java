class Solution {
    int maxi = 0;
    public void recursion(int i,int j,String s,int count){
        if(i > j){
            maxi = Math.max(count,maxi);
            return;
        }
        if(i == j){
            maxi = Math.max(maxi,count+1);
            return;
        }
        if(s.charAt(i) == s.charAt(j)){
            recursion(i+1,j-1,s,count + 2);
        }
        recursion(i+1,j,s,count);
        recursion(i,j-1,s,count);
        

    }
    public int longestPalindromeSubseq(String s) {
        recursion(0,s.length() - 1,s,0);
        return maxi;
    }
}