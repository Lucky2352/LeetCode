class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n % 2 == 0){
            for(int i = 0;i<n/2;i++){
                arr[i] = -1 * (n - i);
                arr[n - i - 1] = n - i;
            }
        }
        else{
            for(int i = 0;i<n/2;i++){
                arr[i] = -1 * (n - i);
                arr[n - i - 1] = n - i;
            }
            arr[n/2] = 0;
        }
        return arr;
    }
}