class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int st[] = {12,123,1234,12345,123456,1234567,12345678,123456789};
        int[] inc = {11,111,1111,11111,111111,1111111,11111111,111111111};
        int end[] ={89,789,6789,56789,456789,3456789,23456789,123456789}; 
        int indx = -1;
        if(low < 100){
            indx = 0;
        }else if(low < 1000){
            indx = 1;
        }else if(low < 10000){
            indx = 2;
        }else if(low < 100000){
            indx = 3;
        }else if(low < 1000000){
            indx = 4;
        }else if(low < 10000000){
            indx = 5;
        }else if(low < 100000000){
            indx = 6;
        }else{
                indx = 7;
        }

        while(indx < st.length){
            int cur = st[indx];
            while(cur <= end[indx]){
                if(cur >= low && cur <= high){
                    list.add(cur);
                }
                cur += inc[indx];
            }
            indx++;
        }
        return list;
    }
}