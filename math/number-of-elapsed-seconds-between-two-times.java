class Solution {
    public int secondsBetweenTimes(String st, String et) {
        int val1 = 0;
        int val2 = 0;
        for(int i = 0;i<8;i++){
            if(Character.isDigit(st.charAt(i))){
                val1 = val1 * 10 +(st.charAt(i) - '0');
            }
            if(Character.isDigit(et.charAt(i))){
                val2 = val2 * 10 +(et.charAt(i) - '0');
            }
        }
        int hourst = val1/10000;
        int minutest = (val1/100)%100;
        int secondst = val1 % 100;

        int houret = val2/10000;
        int minuteet = (val2/100)%100;
        int secondet = val2 % 100;


        int cur1 = hourst*3600 + minutest*60 + secondst;
        int cur2 = houret*3600 + minuteet*60 + secondet;
        return cur2 - cur1;
    }
}