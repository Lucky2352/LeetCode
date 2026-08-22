class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) != ']'){
                st.push(s.charAt(i));
            }
            else{
                StringBuilder it = new StringBuilder("");
                while(!st.isEmpty() && st.peek() != '['){
                    it.append(st.pop());
                }
                it.reverse();
                st.pop();
                StringBuilder val = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    val.append(st.pop());
                }
                val.reverse();
                int count = Integer.parseInt(val.toString());
                String temp = it.toString();

                StringBuilder repeat = new StringBuilder();
                for (int j = 0; j < count; j++) {
                repeat.append(temp);
                }
                for (int k = 0; k < repeat.length(); k++) {
                st.push(repeat.charAt(k));
                }               
            }
            i++;
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}