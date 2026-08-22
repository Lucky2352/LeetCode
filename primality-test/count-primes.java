class Solution {
    public int countPrimes(int n) {
        int arr[] = new int[n + 1];
        for(int i = 2;i*i<n;i++){
            if (arr[i] == 0) {
                for(int p = 2;i * p <n;p++){
                    arr[i * p] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 2;i<n;i++){
            if(arr[i] == 0)count++;
        }
        return count;
    }
}