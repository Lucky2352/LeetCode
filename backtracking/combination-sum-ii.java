class Solution {
    public static void gen(int indx,List<Integer> list,int arr[],List<List<Integer>> ans,int target){ 
				if(0 == target) {
                    ans.add(new ArrayList<>(list));
                    return;
			}
            for(int i = indx;i<arr.length;i++){
                if(i > indx && arr[i] == arr[i - 1])continue;
                if(arr[i] > target)break;
                list.add(arr[i]);
                gen(i+1,list,arr,ans,target - arr[i]);
                list.remove(list.size() - 1);
            }
		}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
        gen(0,list,candidates,ans,target);
        return new ArrayList(ans);
    }
}