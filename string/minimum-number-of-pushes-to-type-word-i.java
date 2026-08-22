class Solution {
    public int minimumPushes(String word) {
        if (word.length() <= 8) return word.length();
        int total = 0;
        if (word.length() <= 16){
            total += 8;
            total += (word.length() - 8 )*2;
            return total;
        } 
        if (word.length() <= 24){
            total += 24;
            total += (word.length() - 16) * 3;
            return total; 
        }
        total += 48;
        total += (word.length() - 24) * 4;

    return total; 
    }
}