class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
        int i = 0;
        int j = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while(i < series1.length && j < series2.length){
            if(series1[i][0] == series2[j][0]){
                List<Integer> list = new ArrayList<>();
                list.add(series1[i][0]);
                list.add(series1[i][1] + series2[j][1]);
                ans.add(new ArrayList<>(list));
                i++;
                j++;
            }else{
                if(series1[i][0] < series2[j][0]){
                    List<Integer> list = new ArrayList<>();
                    list.add(series1[i][0]);
                    list.add(series1[i][1] + series2[j][1]);
                    ans.add(new ArrayList<>(list));
                    i++;
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(series2[j][0]);
                    list.add(series1[i][1] + series2[j][1]);
                    ans.add(new ArrayList<>(list));
                    j++;
                }
            }
        }
        while(i < series1.length){
             List<Integer> list = new ArrayList<>();
                list.add(series1[i][0]);
                list.add(series1[i][1]);
                ans.add(new ArrayList<>(list));
                i++;
        }
        while(j < series2.length){
             List<Integer> list = new ArrayList<>();
                list.add(series2[j][0]);
                list.add(series2[j][1]);
                ans.add(new ArrayList<>(list));
                j++;
        }
        return ans;
    }
}