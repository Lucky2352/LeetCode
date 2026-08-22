class Solution {
    public int maxScore(int[] c, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxi = 0;
        int j = c.length - 1;
        for(int i = 0;i<k;i++){
            leftSum += c[i];
        }
        maxi = leftSum;
        int p = k - 1;
        while(p >= 0){
            leftSum -= c[p];
            rightSum += c[j];
            j--;
            p--;
            maxi = Math.max(maxi,leftSum + rightSum);
        }
        return maxi;
    }
}