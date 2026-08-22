class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            int curent = 0;
            int count = 0;
            for(int j = 1;j * j <= nums[i];j++){
                    if (nums[i] % j == 0) {
                      int d1 = j;
                      int d2 = nums[i] / j;
                    if (d1 == d2) {
                        count += 1;
                        curent += d1;
                    } else {
                        count += 2;
                        curent += d1 + d2;
                    }
                    if (count > 4) break;
                }
            }
            if(count == 4){
                sum += curent;
            }
        }
        return sum;
    }
}