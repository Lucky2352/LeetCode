class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less = 0;
        int high = 0;
        int eq = 0;
        for(int num : nums){
            if(num < pivot){
                less++;
            }else if(num > pivot)high++;
            else{
                eq++;
            }
        }
        int[] arr = new int[nums.length];
        int front = less;
        int middle = less;
        int big = less + eq;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < pivot){
                arr[less - front] = nums[i];
                front--;
            }else if(nums[i] == pivot){
                arr[middle] = nums[i];
                middle++;
            }else{
                arr[big] = nums[i];
                big++;
            }
        }
        return arr;
    }
}