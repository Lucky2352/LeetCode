class Solution {
    public static void check(int index,List<Integer> list,List<List<Integer>> ans,int target,int sum,int k){
        if(index == 10 ||list.size() == k){
            if(sum == target && list.size() == k){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(target >= sum + index){
            list.add(index);
            check(index + 1,list,ans,target,sum + index,k);
            list.remove(list.size() - 1);
        }
        check(index + 1,list,ans,target,sum,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        check(1,list,ans,n,0,k);
        return ans;
    }
}