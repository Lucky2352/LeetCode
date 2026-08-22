class Solution {
    public boolean halvesAreAlike(String s) {
        String check = "aeiouAEIOU";
        int vow = 0;
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j){
            char pehla = Character.toLowerCase(s.charAt(i));
            char dusra = Character.toLowerCase(s.charAt(j));
            if(pehla == 'a' ||pehla == 'e' || pehla == 'i' || pehla == 'o' || pehla == 'u')vow++;
            if(dusra == 'a' || dusra == 'e' || dusra== 'i' || dusra == 'o' || dusra == 'u')vow--;
            i++;
            j--;
        }
        return vow == 0;
    }
}