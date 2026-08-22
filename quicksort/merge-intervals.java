// class Solution {
//     public int[][] merge(int[][] in) {
//         Arrays.sort(in, (row1, row2) -> Integer.compare(row1[0], row2[0]));
//         int min = in[0][0];
//         int max = in[0][1];
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int i = 1;i<in.length;i++){
//             // if(in[i][0] < max && in[i][1] > max ){
//             //     max = in[i][1];
//             // }else if(in[i][0] > max){
//             //     List<Integer> list = new ArrayList<>();
//             //     list.add(min);
//             //     list.add(max);
//             //     ans.add(list);
//             //     min = in[i][0];
//             //     max = in[i][1];
//             // }else{
//             //     continue;
//             // }
//             if (in[i][0] <= max) {
//                 max = Math.max(max, in[i][1]);
//             } else {
//                 ans.add(Arrays.asList(min, max));
//                 min = in[i][0];
//                 max = in[i][1];
//             }
//         }
//         ans.add(Arrays.asList(min, max));
//         int[][] primitiveArray2D = ans.stream()
//                 .map(row -> row.stream().mapToInt(Integer::intValue).toArray())
//                 .toArray(int[][]::new);
//         return primitiveArray2D;
//     }
// }


class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            }else{
                int prb[] = new int[2];
                prb[0] = start;
                prb[1] = end;
                start = intervals[i][0];
                end = intervals[i][1];
                ans.add(prb);
            }
        }
        int prb[] = new int[2];
        prb[0] = start;
        prb[1] = end;
        ans.add(prb);
        return ans.toArray(new int[ans.size()][]);
    }
}