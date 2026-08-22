class Solution {
    public static void rev(int[] arr , int i , int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[grid.length*grid[0].length];
        k %= (grid.length*grid[0].length);
        int q = 0;
        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                arr[q] = grid[i][j];
                q++;
            }
        }
        rev(arr,0,arr.length-1);
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
        int p = 0;
        for(int i = 0 ; i<grid.length ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0 ; j < grid[i].length ; j++){
                list.add(arr[p]);
                p++;
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}