class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder("");
        StringBuilder before = new StringBuilder("");
        StringBuilder after = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == x)after.append(x);
            else if(s.charAt(i) == y)before.append(y);
            else{
                sb.append(s.charAt(i));
            }
        }
        sb.append(after);
        sb.insert(0,before);
        return sb.toString();
    }
}