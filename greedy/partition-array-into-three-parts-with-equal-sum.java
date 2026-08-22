class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        int count = 0;
        if(sum % 3 != 0)return false;
        else{
            int psb = sum / 3;
            int j = 0;
            while(j < arr.length){
                psb -= arr[j];
                if(psb == 0){
                    count++;
                    psb = sum/3;
                }
                j++;
            }
        }
        return count >= 3;
    }
}