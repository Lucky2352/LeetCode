class Solution {
    int count = 0;

    void merge(int[] arr, int low, int mid, int high) {
        int right = mid + 1;

        for (int left = low; left <= mid; left++) {
            while (right <= high && arr[left] > 2L * arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }

        int[] temp = new int[high - low + 1];
        int left = low, k = 0;
        right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
        }

        while (left <= mid)
            temp[k++] = arr[left++];

        while (right <= high)
            temp[k++] = arr[right++];

        for (int i = 0; i < temp.length; i++)
            arr[low + i] = temp[i];
    }

    void sort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public int reversePairs(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return count;
    }
}