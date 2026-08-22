class Solution {
    public static void recursion(int i,int n,List<Integer> list,List<List<Integer>> ans,int k){
            if(list.size() == k){
                ans.add(new ArrayList<>(list));
                return;
            }
            if(i > n)return;
            
        list.add(i);
        recursion(i+1,n,list,ans,k);
        list.remove(list.size() - 1);
        recursion(i+1,n,list,ans,k);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        recursion(1,n,list,ans,k);
        return ans;
    }
}