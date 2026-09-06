class Solution {
    public int recursion(int i,int j,String s,String t,int[][] dp){
        if(j == t.length()){
            return 1;
        }
        if(i == s.length())return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int take = 0;
        if(s.charAt(i) == t.charAt(j)){
           take = recursion(i+1,j+1,s,t,dp);
        }
        int nottake = recursion(i+1,j,s,t,dp);
        return dp[i][j] = take + nottake;
    }
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return recursion(0,0,s,t,dp);
    }
}