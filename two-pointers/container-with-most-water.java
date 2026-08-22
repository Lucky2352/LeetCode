class Solution {
    public int maxArea(int[] h) {
        int i = 0;
        int j = h.length - 1;
        int max = -1;
        while(i < j){
            int len = j - i;
            int height = Math.min(h[i],h[j]);
            max = Math.max(max,len * height);
            if(h[i] < h[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}