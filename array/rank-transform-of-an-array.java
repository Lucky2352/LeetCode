class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0)return new int[] {};
        int prr[] = new int[arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        System.arraycopy(arr, 0, prr, 0, arr.length);
        Arrays.sort(prr);
        int rank = 1;
        for(int i = 0;i<arr.length;i++){
            if(!map.containsKey(prr[i])){
                map.put(prr[i],rank);
                rank++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}