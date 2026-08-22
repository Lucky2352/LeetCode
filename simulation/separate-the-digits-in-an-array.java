class Solution {
    public int[] separateDigits(int[] nums) {
       StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        System.out.println(sb);
        int[] arr = new int[sb.length()];
        for(int i = 0;i<sb.length();i++){
                arr[i] = sb.charAt(i) - '0';
        }
       return arr;
    }
}