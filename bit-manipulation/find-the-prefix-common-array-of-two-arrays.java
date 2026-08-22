class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int j = 0;
        int count = 0;
        while(a != A.length){
            map.put(A[a],map.getOrDefault(A[a],0) + 1);
            map.put(B[a],map.getOrDefault(B[a],0) + 1);
            a++;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == 2){
                    count++;
                }
            }
            A[j] = count;
            j++;
            count = 0;
        }
        return A;
    }
}