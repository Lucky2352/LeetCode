class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];
        // int m = matrix.length;
        // int n = matrix[0].length;
        // boolean[] row = new boolean[m];
        // boolean[] col = new boolean[n];
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (matrix[i][j] == 0) {
        //             row[i] = true;
        //             col[j] = true;
        //         }
        //     }
        // }
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (row[i] || col[j]) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    ans[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] == -1) {
                    int p = i;
                    int q = j;
                    for(int k = 0;k<matrix[0].length;k++){
                        matrix[p][k] = 0;
                    }
                    for(int t = 0;t<matrix.length;t++){
                        matrix[t][q] = 0;
                    }
                }
            }
        }
    }
}