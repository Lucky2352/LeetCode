class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            List<Integer> temp = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            list.add(temp);
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(newInterval[0]);
        temp.add(newInterval[1]);
        list.add(temp);
        while (i < n) {
            temp = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);
            list.add(temp);
            i++;
        }
        int[][] finalInterval = new int[list.size()][2];
        for (i = 0; i < list.size(); i++) {
            finalInterval[i][0] = list.get(i).get(0);
            finalInterval[i][1] = list.get(i).get(1);
        }

        return finalInterval;
    }
}