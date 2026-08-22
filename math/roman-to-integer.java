class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                sum += 1;
            }else if(s.charAt(i) == 'V'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    sum += 3;
                }else{
                    sum += 5;
                }
            }else if(s.charAt(i) == 'X'){
                if(i > 0 && s.charAt(i - 1) == 'I'){
                    sum += 8;
                }else{
                    sum += 10;
                }
            }else if(s.charAt(i) == 'L'){
                if(i > 0 && s.charAt(i - 1) == 'X'){
                    sum += 30;
                }else{
                    sum += 50;
                }
            }else if(s.charAt(i) == 'C'){
                if(i > 0 && s.charAt(i - 1) == 'X'){
                    sum += 80;
                }else{
                    sum += 100;
                }
            }else if(s.charAt(i) == 'D'){
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    sum += 300;
                }else{
                    sum += 500;
                }
            }else{
                if(i > 0 && s.charAt(i - 1) == 'C'){
                    sum += 800;
                }else{
                    sum += 1000;
                }
            }
        }
        return sum;
    }
}