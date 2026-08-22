class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        int count = 0;
        int total = 0;

        for(int i = 0;i<word.length();i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        for(int i = 25;i>=0;i--){
            count++;
            if(freq[i] == 0)break;
            if(count <= 8){
                total += freq[i];
            }else if(count <= 16){
                total += (freq[i] * 2);
            }else if(count <= 24){
                total += (freq[i] * 3);
            }else{
                total += (freq[i] * 4);
            }
        }
        return total;
    }
}