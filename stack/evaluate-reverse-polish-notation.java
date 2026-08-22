class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<t.length;i++){
            String token = t[i];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int s1 = st.pop();
                int s2 = st.pop();
                if(token.equals("+")){
                    int val = s2+s1;
                    st.push(val);
                }else if(token.equals("-")){
                    int val = s2-s1;
                    st.push(val);
                }else if(token.equals("*")){
                    int val = s2*s1;
                    st.push(val);
                }else{
                    int val = s2/s1;
                    st.push(val);
                }
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}