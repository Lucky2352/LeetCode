class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int min = intervals[0][0];
        int max = intervals[0][1];
        int count = 0;
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][1] <= max){
                count++;
            }
            if(intervals[i][1] > max){
                int prev = min;
                int prev1 = max;
                min = intervals[i][0];
                max = intervals[i][1];
                if(prev == min){
                    count++;
                }
            }
        }
        return intervals.length - count;
    }
}