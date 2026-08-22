class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];
        int sum = 0;
        for(int i = 0;i<grid.length;i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 0;j<grid[0].length;j++){
                maxi = Math.max(maxi,grid[i][j]);

            }
            rowMax[i] = maxi;
        }
        for(int i = 0;i<grid.length;i++){
            int maxi = Integer.MIN_VALUE;
            for(int j = 0;j<grid[0].length;j++){
                maxi = Math.max(maxi,grid[j][i]);

            }
            colMax[i] = maxi;
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                sum += Math.abs(grid[i][j] - Math.min(rowMax[i],colMax[j]));

            }
        }
        return sum;
    }
}