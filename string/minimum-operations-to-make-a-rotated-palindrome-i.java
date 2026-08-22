class Solution {
    public int minOperations(String s) {
        int total = Integer.MAX_VALUE;
        for(int i = 0;i<s.length();i++){
            String rotate = s.substring(i) + s.substring(0,i);
            int cur = i;
                for(int j = 0;j<s.length()/2;j++){
                char first = rotate.charAt(j);
                char sec = rotate.charAt(s.length() - j - 1);
                int costltr = (first - sec + 26) % 26;
                int costrtl = (sec - first + 26) % 26;

                cur += Math.min(costltr,costrtl);
            }
            total = Math.min(total,cur);
        }
        return total;
    }
}