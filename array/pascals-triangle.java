class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> list = new ArrayList<>();
            int val = 1;
            for(int j = 1;j<=i;j++){
                list.add(val);
                val *= (i - j);
                val /= j;
            }
            ans.add(list);
        }
        return ans;
    }
}