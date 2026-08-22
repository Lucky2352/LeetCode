class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                sb.append(s.charAt(i));
                i++;
            }
            else if(s.charAt(i) == '*'){
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
                i++;
            }else if(s.charAt(i) == '#'){
                sb.append(sb);
                i++;
            }
            else{
                sb.reverse();
                i++;
            }
        }
        return sb.toString();
    }
}