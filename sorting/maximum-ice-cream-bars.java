class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        for(int psb : costs){
            if(psb <= coins){
                count++;
                coins -= psb;
            }else{
                return count;
            }
        }
        return count;
    }
}