class Solution {
    public static void tp(int i,int n,int[] nums,List<Integer> list ,Set<List<Integer>> st){
        if(i == n){
            st.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        tp(i +1,n,nums,list,st);
        list.remove(list.size() - 1);
        tp(i +1,n,nums,list,st);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);
        Set<List<Integer>> st = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        tp(0,nums.length,nums,list,st);
        return new ArrayList(st);
    }
}