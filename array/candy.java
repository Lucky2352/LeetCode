class Solution {
    public int candy(int[] s) {
        int n = s.length;
        int sum =0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =1;
        }
        for(int i = 1;i<n;i++){
            if(s[i]>s[i-1]){
                arr[i] = arr[i-1] + 1; 
            }
        }
        for(int i = n-2;i>=0;i--){
            if(s[i+1]<s[i]){
                arr[i] = Math.max(arr[i],arr[i+1] + 1);
            }
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }
}