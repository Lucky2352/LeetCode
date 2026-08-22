class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(arr[i]);
                map.put(arr[i], -1);
            } 
            else{
                while (!st.isEmpty() && st.peek() < arr[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    st.push(arr[i]);
                    map.put(arr[i], -1);
                } 
                else {
                    map.put(arr[i], st.peek());
                    st.push(arr[i]);
                }
            }
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}