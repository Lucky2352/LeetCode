class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums,target), last(nums , target)};
    }
    public int first(int[] nums,int target){ 
        int firste = -1;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target==nums[mid]){
                firste = mid;
                high = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return firste;
}
    public int last(int[] nums,int target){
        int laste = -1;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target==nums[mid]){
                laste = mid;
                low = mid + 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return laste;
    }
}