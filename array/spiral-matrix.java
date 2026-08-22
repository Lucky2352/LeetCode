class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;
        List<Integer> list = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left;i<=right;i++){
                list.add(mat[top][i]);
            }
            for(int i = top + 1;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            if(top < bottom){
                for(int i = right - 1;i >=left;i--){
                list.add(mat[bottom][i]);
            }
            }
            
            if(left < right){
                for(int i = bottom - 1;i>top;i--){
                list.add(mat[i][left]);
            }
            }
            
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }
}