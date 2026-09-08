class Solution {
    public String longestPrefix(String s) {
        int i = 0;
        int j = 1;
        int arr[] = new int[s.length()];
        arr[0] = 0;
        while(j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                arr[j] = i+1;
                j++;
                i++;
            }else{
                if(i > 0){
                i = arr[i - 1];
                }else{
                    arr[j]=0;
                    j++;

                }
            }
        }
        int maxi = 0;
        for(int num : arr){
            maxi = Math.max(maxi,num);
        }
        return s.substring(0,maxi);
    }
}