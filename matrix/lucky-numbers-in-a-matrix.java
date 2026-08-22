class Solution {
    public static int mini(int[] arr){
        int min = arr[0];
        int indx = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
                indx = i;
            }
        }
        return indx;
    }

    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<mat.length;i++){
            int indx = mini(mat[i]);
            int val1 = mat[i][indx];
            boolean flag = true;
            for(int j = 0;j<mat.length;j++){
                if(mat[j][indx] > val1){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                list.add(val1);
            }
        }
        return list;
    }
}