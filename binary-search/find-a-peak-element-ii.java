class Solution {
    public static int max(int[][] mat, int c) {
    int k = 0;
    for (int i = 1; i < mat.length; i++) {
        if (mat[i][c] > mat[k][c]) {
            k = i;
        }
    }
    return k;
}
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length - 1;
        int row = 0;
        int left = 0;
        int right = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            row = max(mat,mid);
            left = mid - 1 >=0 ? mat[row][mid - 1] : -1;
            right = mid + 1 < mat[0].length ? mat[row][mid + 1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[] {row,mid};
            }else if(mat[row][mid] < left){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }
}