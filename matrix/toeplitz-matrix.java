class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        for(int i = 0;i<mat.length - 1;i++){
            for(int j = 0;j<mat[0].length - 1;j++){
                int p = i;
                int q = j;
                while(p < mat.length - 1 && q <mat[0].length - 1){
                    if(mat[p][q] != mat[p+1][q+1])return false;
                    else{
                        p++;
                        q++;
                    }
                }
            }
        }
        return true;
    }
}