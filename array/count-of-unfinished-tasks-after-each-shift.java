class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        long prefixSum[] = new long[tasks.length +1];
        for(int i = 0;i< tasks.length;i++){
            prefixSum[i+1] = prefixSum[i]+tasks[i];
        }
        int[] ans = new int[shifts.length];

        int j = 0;
        long rem = tasks[0];
        for(int i = 0;i<shifts.length;i++){
            long time = shifts[i];

            if(time >= rem){
                time -= rem;
                j++;

                if(j == tasks.length){
                ans[i] = 0;
                j = 0;
                rem = tasks[0];
                continue;
            }
            }else{
                rem -= time;
                ans[i] = tasks.length - j;
                continue;
            }

            long key = prefixSum[j] + time;

            int low = j;
            int high = tasks.length;

            while(low < high){
                int mid = low + (high - low +1)/2;
                if(prefixSum[mid] <= key){
                    low = mid;
                }else{
                    high = mid - 1;
                }
            }
            int finish = low;
            time -= (prefixSum[finish] - prefixSum[j]);
            j = finish;

            if(j == tasks.length){
                ans[i] = 0;
                j = 0;
                rem = tasks[0];
            }else{
                rem = tasks[j] - time;
                ans[i] = tasks.length - j;
            }
        }
        return ans;
    }
}