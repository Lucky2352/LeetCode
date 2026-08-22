class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int min = intervals[0][0];
        int max = intervals[0][1];
        int count = 1;
        int i = 1;
        while(i < intervals.length){
            if(intervals[i][0] >= max){
                count++;
                max = intervals[i][1];
            }
            i++;
        }
        return intervals.length - count;
    }
}