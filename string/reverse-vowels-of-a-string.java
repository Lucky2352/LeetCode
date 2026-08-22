class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        String v = "AEIOUaeiou";
        while(left < right){
            if(v.contains(String.valueOf(arr[left])) && v.contains(String.valueOf(arr[right]))){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!v.contains(String.valueOf(arr[left]))){
                left++;
            }
            else right--;
        }
        return new String(arr);
    }
}